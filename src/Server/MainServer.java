package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*(3)*/
public class MainServer {
	public static void main(String args[]) {
		try {
			Registry miRegistry = LocateRegistry.createRegistry(1234);
			miRegistry.rebind("Mate", new ServerImplements());
			System.out.println("Servidor Corriendo...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
