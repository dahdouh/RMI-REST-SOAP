package barry.karim;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {

	public Server() {}


	public static void main(String args[]) {

		try {
			AnimalImpl animal = new AnimalImpl();
			Registry registry = LocateRegistry.createRegistry(1099);
		    
			//Question 2
			//configuration et ajoute de gestionnaire de sécurité
			System.setProperty("java.security.policy","file:/home/karim/eclipse-workspace/RMI-1er-version-server/src/barry/karim/rmi.policy");
			if (System.getSecurityManager() == null) {
				System.setSecurityManager(new RMISecurityManager());
			}

			if (registry==null){
				System.err.println("RmiRegistry n'est pas trouvé");
			}else{
				registry.bind("IAnimal", animal);
				System.err.println("Serveur prêt...");
			}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}