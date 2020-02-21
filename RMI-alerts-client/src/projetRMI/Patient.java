package projetRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Patient extends Remote {
	void alert() throws RemoteException;

}
