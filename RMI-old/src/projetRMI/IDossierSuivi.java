package projetRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDossierSuivi extends Remote {
	
	public void afficherDossierSuivi() throws RemoteException;
	public void modofierDossierSuivi(DossierSuivi ds) throws RemoteException;

}
