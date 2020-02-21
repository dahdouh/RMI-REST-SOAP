package projetRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface CabinetVeterinaire extends Remote{
	
	void RecherchePatient(String animal) throws RemoteException;
}
