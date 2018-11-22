package Cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

import RMI.RemoteInterface;

public class MainCliente {

	public static void main(String[] args) {
		try {
			int x = 5, y = 3;

			Registry miRegistro = LocateRegistry.getRegistry("127.0.0.1", 1234);
			RemoteInterface ri = (RemoteInterface) miRegistro.lookup("Mate");
			JOptionPane.showMessageDialog(null, "Resultado suma: " + ri.suma(x, y));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
