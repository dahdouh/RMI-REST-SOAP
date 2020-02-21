package projetRMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.registry.Registry;
public class ClientOld {
	private ClientOld() {}

	public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			IAnimal stub = (IAnimal) registry.lookup("IAnimal");
			IDossierSuivi stub2 = (IDossierSuivi) registry.lookup("IDossierSuivi");
			//CabinetVeterinaire stub3 = (CabinetVeterinaire) registry.lookup("CabinetVeterinaire");
			stub.afficherAnimal();
			//stub.afficherEspece("pitbull");
			stub2.afficherDossierSuivi();
			//stub.modifierDossierSuivi("dc02");
			//stub.afficherDossierSuivi();
			//stub3.RecherchePatient("medor");
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
