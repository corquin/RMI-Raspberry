package Server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainServer {
	public static void main(String args[]) {
		try {
			Registry miRegistry = LocateRegistry.createRegistry(22);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
