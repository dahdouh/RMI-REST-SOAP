package barry.karim;

import java.io.Serializable;

public class Espece implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String nom;
	protected String dureeVie;
	
	public Espece(String nom, String nomDureeVie) {
		super();
		this.nom = nom;
		this.dureeVie = nomDureeVie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDureeVie() {
		return dureeVie;
	}
	public void setNomDureeVie(String nomDureeVie) {
		this.dureeVie = nomDureeVie;
	}
	
}
