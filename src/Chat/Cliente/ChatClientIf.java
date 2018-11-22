package Chat.Cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClientIf extends Remote {
	void retrieveMessage(String message) throws RemoteException;
}
