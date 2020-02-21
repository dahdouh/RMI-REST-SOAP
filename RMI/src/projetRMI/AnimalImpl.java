package projetRMI;



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AnimalImpl extends UnicastRemoteObject  implements IAnimal {

	public AnimalImpl() throws RemoteException{
	}

	Espece es=new Espece("pitbull","20");
	DossierSuiviImp ds = new DossierSuiviImp(new DossierSuivi("dc01"));
	Animal a=new Animal("medor","alpha",es,"pitbull",ds);
	
	public void afficherAnimal() throws RemoteException {
		
		String nom=a.getNom();
		String nm=a.getNomMaitre();
		System.out.println("nom animal :" +nom+ " nom maître :" +nm);
	}
	public void afficherEspece(String e) throws RemoteException {
		Espece es=new Espece("pitbull","20");
		if(e.equals(es.getNom())) {
			System.out.println("\nl'espece du chien "+e+" est :" +es.getNom()+ " et sa duree de vie est environ :" +es.getDureeVie());
		}else {
			System.out.println("pas trouvé");
		}
	}
	
	/*
	@Override
	public void afficherDossierSuivi() throws RemoteException {
		System.out.println("dossier de suivi : "+ this.a.dossiersuivi.getNumero());
		
	}

	@Override
	public void modifierDossierSuivi(String num) throws RemoteException {
		this.a.dossiersuivi.setNumero(num);		
	}
	
	*/
	
	
}
