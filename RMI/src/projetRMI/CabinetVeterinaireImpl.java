package projetRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class CabinetVeterinaireImpl extends UnicastRemoteObject implements CabinetVeterinaire {

	protected CabinetVeterinaireImpl() throws RemoteException {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void RecherchePatient(String animal) throws RemoteException {
		ArrayList<Animal> listePatient = new ArrayList<Animal>();
		
		//listePatient.add(new Animal("medor","karim",new Espece("pitbull","20 ans"),"pitbull", new DossierSuivi("dc003")));
		//listePatient.add(new Animal("rambo","karim",new Espece("pitbull","20 ans"),"pitbull", new DossierSuivi("dc003")));
		//listePatient.add(new Animal("vandam","karim",new Espece("pitbull","20 ans"),"pitbull", new DossierSuivi("dc003")));

		for (Animal anim : listePatient) {
			if(animal.equals(anim.getNom())) {
				System.out.print("Le patient trouvé est :"+ anim.getNom() +" son maitre est :"+anim.getNomMaitre());
			}
		}
	}

	private void foreach(Object object) {
		// TODO Auto-generated method stub
		
	}

}
