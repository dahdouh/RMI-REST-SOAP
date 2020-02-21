package projetRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CabinetVeterinaireImpl extends UnicastRemoteObject implements CabinetVeterinaire {

	protected List<AnimalImpl> listePatient = new ArrayList<AnimalImpl>();
	
	protected CabinetVeterinaireImpl() throws RemoteException {
		super();
		listePatient.add(new AnimalImpl(new Animal("medor","karim",new Espece("pitbull","20 ans"),"pitbull", new DossierSuiviImp(new DossierSuivi("dc003")))));
		listePatient.add(new AnimalImpl(new Animal("rambo","barry",new Espece("pitbull","22 ans"),"pitbull", new DossierSuiviImp(new DossierSuivi("dc003")))));

	}
	AnimalImpl a=new AnimalImpl();
	@Override
	public void RecherchePatient(String animal) throws RemoteException {
	    System.out.println("\n\nRecherche des patients ayant pour nom :"+animal);
		for (AnimalImpl anim : listePatient) {
			if(animal.equals(anim.getAnimal().getNom())) {
				System.out.print("\nLe patient trouvé est :"+ anim.getAnimal().getNom() +" son maitre est :"+anim.getAnimal().getNomMaitre());
			}
		
		}
	}

	@Override
	public void getAnimal() throws RemoteException {
		System.out.print("\nliste des Patients :");
		for (AnimalImpl anim : listePatient) {
				System.out.print("\nnom: "+ anim.getAnimal().getNom() +" son maitre est :"+anim.getAnimal().getNomMaitre());
			}
		}

	@Override
	public void ajouterPatient(String nom, String maitre) throws RemoteException {
		listePatient.add(new AnimalImpl(new Animal(nom,maitre)));
		if(listePatient.add(a)==true) 
			System.out.print("Patient ajouté avec succes\n");
		System.out.println("le patient ajouté a pour nom :"+nom+" et son maitre est :"+maitre);
		
	}

	
}




