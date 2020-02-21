package projetRMI;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {

	public Server() {}


	public static void main(String args[]) {

		try {
			AnimalImpl animal = new AnimalImpl();
			DossierSuiviImp dossierSuivi = new DossierSuiviImp();
			////CabinetVeterinaireImpl objj = new CabinetVeterinaireImpl();
			Registry registry = LocateRegistry.createRegistry(1079);
			//System.setSecurityManager(new RMISecurityManager());
			//Registry registry = LocateRegistry.getRegistry();
			if (registry==null){
				System.err.println("RmiRegistry not found");
			}else{
				registry.bind("IAnimal", animal);
				registry.bind("IDossierSuivi", dossierSuivi);
				////registry.bind("CabinetVeterinaire", objj);
				System.err.println("Server ready");
			}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}