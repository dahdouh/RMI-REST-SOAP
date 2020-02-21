package barry.karim;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.registry.Registry;
public class Client {
	private Client() {}

	public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
					
			IAnimal stub = (IAnimal) registry.lookup("IAnimal");
			
			//Question 1
			stub.afficherAnimal();
			
			//Question 3
			stub.getDossierSuivi();
			stub.modifierDossierSuivi("dc003");

			//QUestion 4
			stub.getEspece();
			
			//stub.getDossierSuivi();
			//stub3.RecherchePatient("medor");
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
