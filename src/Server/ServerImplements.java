package Server;

import java.rmi.server.UnicastRemoteObject;

import RMI.RemoteInterface;

/*(2)*/
public class ServerImplements extends UnicastRemoteObject implements RemoteInterface {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServerImplements() throws Exception {
		super();
	}

	@Override
	public int suma(int x, int y) throws Exception {
		return (x + y);
	}
	
	
}
