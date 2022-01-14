package dal;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import bo.Seance;

public class SeanceDAO {
	
	private static Session session;
	
	static {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
											.configure("hibernate.cfg.xml")
											.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		session = factory.openSession();
	}
	
	public static List<Seance> selectAll() {
		return session.createQuery("from Seance order by prix", Seance.class).list();
	}

}
