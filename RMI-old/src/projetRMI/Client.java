package projetRMI;

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
			stub.afficherAnimal();
			stub.modifierDossierSuivi("ds 547");
			stub.afficherDossierSuivi();
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
