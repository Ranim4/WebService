package rest;

import java.util.List;

import bll.SeanceManager;
import bo.Seance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("seances")
public class GestionSeance {
	
	@GET
	public List<Seance> consulterSeances() {
		return SeanceManager.selectAll();
	}
//    public String getIt() {
//        return "Got it!";
//    }

}
