package projetRMI;



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AnimalImpl extends UnicastRemoteObject  implements IAnimal {

	protected Animal a;
	protected DossierSuivi ds;
	public AnimalImpl() throws RemoteException{
	}
	
	public void afficherAnimal() throws RemoteException {
		DossierSuivi ds = new DossierSuivi("d 567");
		a=new Animal("medor","alpha","pitbull","pitbull", ds);
		String nom=a.getNom();
		String nm=a.getNomMaitre();
		
		System.out.println("nom animal :" +nom+ " nom maître :" +nm+ " espece: "+a.getEspece()+ " dossier suivi: "+ a.getDossierSuivi().getNumero());		
	}

	@Override
	public void afficherDossierSuivi() throws RemoteException {
		System.out.println("dossier de suivi : "+ this.a.dossiersuivi.getNumero());
		
	}

	@Override
	public void modifierDossierSuivi(String num) throws RemoteException {
		this.a.dossiersuivi.setNumero(num);		
	}
}
