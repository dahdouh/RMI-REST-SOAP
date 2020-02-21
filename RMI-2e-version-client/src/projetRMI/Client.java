package projetRMI;

import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.registry.Registry;
public class Client {
	private Client() {}

	public static void main(String[] args) throws RemoteException {
	  
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			CabinetVeterinaire stub = (CabinetVeterinaire) registry.lookup("CabinetVeterinaire");
			
			stub.ajouterPatient("pit","amine");
			stub.getAnimal();
			stub.RecherchePatient("medor");
			
		   } catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
