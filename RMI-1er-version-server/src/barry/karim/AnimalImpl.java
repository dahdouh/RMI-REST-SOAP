package barry.karim;



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AnimalImpl extends UnicastRemoteObject  implements IAnimal {
	
	Espece espece=new Espece("pitbull","20");
	DossierSuiviImp dossierSuivi = new DossierSuiviImp(new DossierSuivi("dc01"));
	Animal animal = new Animal("medor","alpha",espece,"pitbull",dossierSuivi);

	public AnimalImpl() throws RemoteException{
	}
	
	public AnimalImpl(Animal animal) throws RemoteException{
		this.animal = animal;
	}
	
	public void afficherAnimal() throws RemoteException {
		
		String nom=animal.getNom();
		String maitre=animal.getNomMaitre();
		String race = animal.getRace();
		System.out.println("nom animal :" +nom+ " nom maître :" + maitre + " race: "+ race + "\n");
		System.out.println("Espece: nom: "+ this.animal.espece.nom + ", durrée de vie: "+ this.animal.espece.dureeVie);
	}
	
	public void getEspece() throws RemoteException {
		System.out.println("\nl'espece du chien est :" +this.animal.espece.getNom()+ " et sa duree de vie est environ :" +this.animal.espece.getDureeVie());	
	}
	
	@Override
	public void getDossierSuivi() throws RemoteException {
		this.animal.getDossierSuivi().afficherDossierSuivi();
		
	}
	@Override
	public void modifierDossierSuivi(String dossier) throws RemoteException {
		this.animal.getDossierSuivi().modofierDossierSuivi(dossier);
		
	}


	
	
	
	
}
