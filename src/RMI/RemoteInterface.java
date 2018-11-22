package RMI;

import java.rmi.Remote;

/*(1)*/
public interface RemoteInterface extends Remote {
	public int suma(int x, int y) throws Exception;
}
