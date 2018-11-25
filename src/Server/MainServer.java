package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*(3)*/
public class MainServer {
	public static void main(String args[]) {
		try {
			System.setProperty("java.rmi.server.hostname","192.168.1.6");
			Registry miRegistry = LocateRegistry.createRegistry(1081);
			ServerImplements si = new ServerImplements();
			System.out.println(Registry.REGISTRY_PORT);
			miRegistry.bind("rmi://localhost:3000/mate", si);
			System.out.println("El servidor se encuentra escuchando...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
