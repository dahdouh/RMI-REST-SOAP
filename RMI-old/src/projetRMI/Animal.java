package projetRMI;

public class Animal{
	protected String nom;
	protected String nomMaitre;
	protected String espece;
	protected String race;
	protected DossierSuivi dossiersuivi;
	
	
	public Animal(String nom, String nomMaitre, String espece, String race, DossierSuivi ds){
		this.nom=nom;
		this.nomMaitre=nomMaitre;
		this.espece=espece;
		this.race=race;
		this.dossiersuivi = ds;
	}
	public Animal(){};
	
	public String getNom(){
		return this.nom;
	}
	public String getNomMaitre(){
		return this.nomMaitre;
	}
	public String getEspece(){
		return this.espece;
	}
	public String getRace(){
		return this.race;
	}
	public void setNom(String nom){
		this.nom=nom;
	}
	public void setNomMaitre(String nomMaitre){
		this.nomMaitre=nomMaitre;
	}
	public void setEspece(String espece){
		this.espece=espece;
	}
	public void setRace(String race){
		this.race=race;
	}
	
	public DossierSuivi getDossierSuivi() {
		return this.dossiersuivi;
	}
	public void setDossierSuivi(DossierSuivi ds) {
		this.dossiersuivi = ds;
	}
}
