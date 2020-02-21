package projetRMI;

import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
	
	public static Registry registry;

	public Server() {}


	//mecanisme inscription d'un objet chez le serveeur qui a la methode qui va faire l'affichage/notification
	// le client creer un proxy et l'envoyer au serveur comme parametre
	//le serveur prend objet passe en parametre par le client et le enregistre dans une liste
	// le méthode notify cote serveur parcours liste client et l'envoi des notifcations
	
	public static void main(String args[]) {

		//String host = (args.length < 1) ? null : args[0];
		try {
			
			CabinetVeterinaireImpl obj = new CabinetVeterinaireImpl();
			registry = LocateRegistry.createRegistry(1099);
			
			System.setProperty("java.security.policy","file:/home/karim/Documents/Aigle/S2/ArchiDis/TP/1/RMI-alerts-server/src/projetRMI/rmi.policy");
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