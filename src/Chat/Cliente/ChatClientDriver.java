package Chat.Cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import Chat.Servidor.ChatServerIf;

public class ChatClientDriver {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		String chatServerUrl = "127.0.0.1/ChatRMI";
		ChatServerIf chatServer = (ChatServerIf) Naming.lookup(chatServerUrl);
		new Thread(new ChatClient(args[0], chatServer)).start();		
	}

}
