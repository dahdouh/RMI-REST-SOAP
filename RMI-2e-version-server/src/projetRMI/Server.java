package projetRMI;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {

	public Server() {}


	public static void main(String args[]) {

		try {
			
			CabinetVeterinaireImpl obj = new CabinetVeterinaireImpl();
			Registry registry = LocateRegistry.createRegistry(1099);
			
			//configurer la security policy
			System.setProperty("java.security.policy","file:/home/karim/Documents/Aigle/S2/ArchiDis/TP/1/RMI-2e-version-server/src/projetRMI/rmi.policy");
			if (System.getSecurityManager() == null) 
				System.setSecurityManager(new RMISecurityManager());
			
			if (registry==null){
				System.err.println("RmiRegistry not found");
			}
			else{
				registry.bind("CabinetVeterinaire", obj);
				System.err.println("Serveur lancé !");
			}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
}