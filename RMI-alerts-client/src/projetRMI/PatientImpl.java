package projetRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PatientImpl extends UnicastRemoteObject implements Patient {

	protected PatientImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void alert() throws RemoteException {
		System.out.println("Alert du serveur: attention !!");
	}

}
