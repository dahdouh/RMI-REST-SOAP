package projetRMI;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface IAnimal extends Remote{
	void afficherAnimal() throws RemoteException;
	void afficherDossierSuivi() throws RemoteException;
	void modifierDossierSuivi(String num) throws RemoteException;
}


