package Chat.Servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

import Chat.Cliente.ChatClientIf;

public interface ChatServerIf extends Remote{
	void registerChatCliente(ChatClientIf ccI) throws RemoteException;
	void broadcastMessage(String message) throws RemoteException;
}
