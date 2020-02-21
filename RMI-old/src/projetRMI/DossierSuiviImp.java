package projetRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DossierSuiviImp  extends UnicastRemoteObject implements IDossierSuivi {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected DossierSuivi ds; 
	public DossierSuiviImp(DossierSuivi ds) throws RemoteException {
		this.ds= ds;
	}

	@Override
	public void afficherDossierSuivi() throws RemoteException {
		System.out.print("Dossier de suivi :"+ this.ds.numero);
		
	}

	@Override
	public void modofierDossierSuivi(DossierSuivi ds) throws RemoteException {
		this.ds = ds;		
	}
	
	public DossierSuivi getDs() {
		return this.ds;
	}
	public void setDs(DossierSuivi ds) {
		this.ds = ds;
	}
	/*
	public String toString() {
		return "dossier Suivi :"+this.ds;
	}
	*/
	
	

}
