package bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="salle")
public class Salle {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSalle;
	private String nomSalle;
	private String typeSalle;
	private double Capacite;
	
	public Salle() {}
	
	public Salle(int idSalle, String nomSalle, String typeSalle, double capacite) {
		super();
		this.idSalle = idSalle;
		this.nomSalle = nomSalle;
		this.typeSalle = typeSalle;
		this.Capacite = capacite;
	}

	public int getIdSalle() {
		return idSalle;
	}

	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}

	public String getTypeSalle() {
		return typeSalle;
	}

	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}

	public double getCapacite() {
		return Capacite;
	}

	public void setCapacite(double capacite) {
		Capacite = capacite;
	}

}