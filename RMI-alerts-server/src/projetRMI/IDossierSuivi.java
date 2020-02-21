package projetRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDossierSuivi extends Remote {
		
	void afficherDossierSuivi() throws RemoteException;

	void modofierDossierSuivi(String ds) throws RemoteException;
	

}
