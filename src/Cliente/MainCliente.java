package Cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

import RMI.RemoteInterface;

public class MainCliente {

	public static void main(String[] args) {
		try {
			int x = 10, y = 3;

			Registry miRegistro = LocateRegistry.getRegistry("192.168.1.6", 1081);
			RemoteInterface ri = (RemoteInterface) miRegistro.lookup("rmi://localhost:3000/mate");
			JOptionPane.showMessageDialog(null, "Resultado suma: " + ri.suma(x, y));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
