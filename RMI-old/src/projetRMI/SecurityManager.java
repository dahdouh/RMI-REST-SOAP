package projetRMI;

import java.rmi.RMISecurityManager;

public class SecurityManager {

	public static void main(String[] args) {
		 try {
			    if (System.getSecurityManager() == null) {
			      System.setSecurityManager(new RMISecurityManager());
			    }
			  } catch (Exception e) {
			     e.printStackTrace();
			  }

	}

}
