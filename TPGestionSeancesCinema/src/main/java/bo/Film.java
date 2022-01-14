package bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="film")
public class Film {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFilm;
	private String titre;
	private String typeFilm;
	private String realisateur;
	private Date date;
	private int duree;
	
	public Film() {};
	
	public Film(int idFilm, String titre, String typeFilm, String realisateur, int duree) {
		super();
		this.idFilm = idFilm;
		this.titre = titre;
		this.typeFilm = typeFilm;
		this.realisateur = realisateur;
		this.duree = duree;
	}
	
	public Film(int idFilm, String titre, String typeFilm, String realisateur, Date d, int duree) {
		super();
		this.idFilm = idFilm;
		this.titre = titre;
		this.typeFilm = typeFilm;
		this.realisateur = realisateur;
		this.date = d;
		this.duree = duree;
	}

	public int getId() {
		return idFilm;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTypeFilm() {
		return typeFilm;
	}

	public void setTypeFilm(String typeFilm) {
		this.typeFilm = typeFilm;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date d) {
		this.date = d;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "\nFilm [id = "+ idFilm + ", titre=" + titre + ", typeFilm=" + typeFilm + ", realisateur=" + realisateur + ", date=" + date
				+ ", duree=" + duree + "]";
	}
	
	
}
