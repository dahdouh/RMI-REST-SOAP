package projetRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DossierSuiviImp  extends UnicastRemoteObject implements IDossierSuivi {
	
	protected DossierSuivi dossier; 
	
	public DossierSuiviImp() throws RemoteException {
		
	}

	public DossierSuiviImp(DossierSuivi ds) throws RemoteException {
		this.dossier = ds;
	}

	@Override
	public void afficherDossierSuivi() throws RemoteException {
		System.out.print("Dossier de suivi :"+ this.dossier.getNumero());
		
	}

	@Override
	public void modofierDossierSuivi(String ds) throws RemoteException {
		this.dossier.setNumero(ds);	
	}

	/*
	public String toString() {
		return "dossier Suivi :"+this.ds;
	}
	*/
	
	

}
