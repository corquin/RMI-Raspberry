package RMI;

import java.rmi.Remote;

public interface RemoteInterface extends Remote {
	public int suma(int x, int y) throws Exception;
}
