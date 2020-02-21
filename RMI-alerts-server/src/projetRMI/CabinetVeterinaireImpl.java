package projetRMI;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CabinetVeterinaireImpl extends UnicastRemoteObject implements CabinetVeterinaire {

	protected List<AnimalImpl> listeAnimal = new ArrayList<AnimalImpl>();
	
	protected List<Patient> listp = new ArrayList<Patient>();
	
	protected CabinetVeterinaireImpl() throws RemoteException {
		super();
		listeAnimal.add(new AnimalImpl(new Animal("medor","karim",new Espece("pitbull","20 ans"),"pitbull", new DossierSuiviImp(new DossierSuivi("dc003")))));
		listeAnimal.add(new AnimalImpl(new Animal("rambo","barry",new Espece("pitbull","22 ans"),"pitbull", new DossierSuiviImp(new DossierSuivi("dc003")))));

	}
	AnimalImpl a=new AnimalImpl();
	@Override
	public void RecherchePatient(String animal) throws RemoteException {
	    System.out.println("\n\nRecherche des patients ayant pour nom :"+animal);
		for (AnimalImpl anim : listeAnimal) {
			if(animal.equals(anim.getAnimal().getNom())) {
				System.out.print("\nLe patient trouvé est :"+ anim.getAnimal().getNom() +" son maitre est :"+anim.getAnimal().getNomMaitre());
			}
		
		}
	}
	
	
	@Override
	public void getAnimal() throws RemoteException {
		System.out.print("\nliste des Patients :");
		for (AnimalImpl anim : listeAnimal) {
				System.out.print("\nnom: "+ anim.getAnimal().getNom() +" son maitre est :"+anim.getAnimal().getNomMaitre());
			}
		}

	@Override
	public void ajouterPatient(String nom, String maitre) throws RemoteException {
		listeAnimal.add(new AnimalImpl(new Animal(nom,maitre)));
		if(listeAnimal.add(a)==true) 
			System.out.print("Patient ajouté avec succes\n");
		System.out.println("le patient ajouté a pour nom :"+nom+" et son maitre est :"+maitre);
		for(Patient p: listp) {
			p.notify();
		}
		//Registry reg = LocateRegistry.getRegistry(host);
		try {
			Patient stub = (Patient) Server.registry.lookup("Patient");
			//if(obj.listeAnimal.size()>=0) {
				stub.notify();
			//}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void registerClient(Patient p) throws RemoteException {
		try {
			//PatientImpl obj = new PatientImpl();
			//Server.registry.bind("Patient", obj);
			listp.add(p);
			System.out.println("le patient à bien été enregistré.");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
		
		
	}

	
	
	
	
	}




