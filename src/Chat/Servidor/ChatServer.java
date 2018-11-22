package Chat.Servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import Chat.Cliente.ChatClientIf;

public class ChatServer extends UnicastRemoteObject implements ChatServerIf {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<ChatClientIf> chatCliente;
	
	protected ChatServer() throws RemoteException {
		chatCliente = new ArrayList<ChatClientIf>();
	}	

	@Override
	public synchronized void registerChatCliente(ChatClientIf ccI) throws RemoteException {
		this.chatCliente.add(ccI);		
	}

	@Override
	public synchronized void broadcastMessage(String message) throws RemoteException {
		int i = 0;
		while (i < chatCliente.size()) {
			chatCliente.get(i++).retrieveMessage(message);			
		}
	}

}
