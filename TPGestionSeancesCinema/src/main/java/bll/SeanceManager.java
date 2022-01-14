package bll;

import java.util.List;

import bo.Seance;
import dal.SeanceDAO;

public class SeanceManager {
	
	public static List<Seance> selectAll() {
		return SeanceDAO.selectAll();
	}

}
