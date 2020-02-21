package projetRMI;

public class Animal{
	protected String nom;
	protected String nomMaitre;
	protected String race;
	protected DossierSuiviImp dossierSuiviImp;
	protected Espece espece;
		
	
	public Animal(String nom, String nomMaitre, Espece espece, String race){
		this.nom=nom;
		this.nomMaitre=nomMaitre;
		this.espece=espece;
		this.race=race;
	}
	public Animal(String nom, String nomMaitre, Espece espece, String race, DossierSuiviImp dossierSuiviImp) {
		super();
		this.nom = nom;
		this.nomMaitre = nomMaitre;
		this.espece = espece;
		this.race = race;
		this.dossierSuiviImp = dossierSuiviImp;
	}
	public Animal(){};
	
	public Animal(String nom, String maitre) {
		this.nom=nom;
		this.nomMaitre=maitre;
	}
	public String getNom(){
		return this.nom;
	}
	public String getNomMaitre(){
		return this.nomMaitre;
	}
	public Espece getEspece(){
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
	public void setEspece(Espece espece){
		this.espece=espece;
	}
	public void setRace(String race){
		this.race=race;
	}
	public void setDossierSuivi(DossierSuiviImp dsi) {
		this.dossierSuiviImp = dsi;
	}
	public DossierSuiviImp getDossierSuivi() {
		return this.dossierSuiviImp;
	}
	
}
