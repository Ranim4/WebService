package bo;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.*;


@Entity @Table(name="seance")
public class Seance {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSeance;
	private Date dateSeance;
	private LocalTime heureDebut;
	private LocalTime heureFin;
	private Float prix;
	@ManyToOne
	@JoinColumn(name="idFilm", foreignKey=@ForeignKey(name="Seance_FK_1"))
	private Film film;
	@ManyToOne
	@JoinColumn(name="idSalle", foreignKey=@ForeignKey(name="Seance_FK"))
	private Salle salle;
	private String titre;
	private String nomSalle;
	
	public Seance() {}
	
	public Seance(Integer idSeance, Date dateSeance, LocalTime heureDebut, LocalTime heureFin, Float prix, Film film,
			Salle salle, String titre, String nomSalle) {
		super();
		this.idSeance = idSeance;
		this.dateSeance = dateSeance;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
		this.prix = prix;
		this.film = film;
		this.salle = salle;
		this.titre = titre;
		this.nomSalle = nomSalle;
		
	}

	public Integer getIdSeance() {
		return idSeance;
	}

	public void setIdSeance(Integer idSeance) {
		this.idSeance = idSeance;
	}

	public Date getDateSeance() {
		return dateSeance;
	}

	public void setDateSeance(Date dateSeance) {
		this.dateSeance = dateSeance;
	}

	public LocalTime getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(LocalTime heureDebut) {
		this.heureDebut = heureDebut;
	}

	public LocalTime getHeureFin() {
		return heureFin;
	}

	public void setHeureFinSeance(LocalTime heureFinSeance) {
		this.heureFin = heureFinSeance;
	}

	public Float getPrix() {
		return prix;
	}

	public void setPrix(Float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Seance [dateSeance=" + dateSeance + ", heureDebut=" + heureDebut
				+ ", heureFin=" + heureFin + ", prix=" + prix + ", titreFilm=" + titre + ", nomSalle=" + nomSalle + "]";
	}


}
