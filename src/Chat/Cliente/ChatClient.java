package Chat.Cliente;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import Chat.Servidor.ChatServerIf;

public class ChatClient extends UnicastRemoteObject implements ChatClientIf, Runnable {

	private static final long serialVersionUID = 1L;
	
	private ChatServerIf chatServer;
	private String name = null;
	protected ChatClient(String name, ChatServerIf chatServer) throws RemoteException {
		this.name = name;
		this.chatServer = chatServer;
		chatServer.registerChatCliente(this);
	} 	
	
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		String message;
		while (true) {
			message = scanner.nextLine();
			try {
				chatServer.broadcastMessage(name + ": " + message);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@Override
	public void retrieveMessage(String message) throws RemoteException {
		System.out.println(message);
	}

}
