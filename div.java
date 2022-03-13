// Creating a DivInterface interface
import java.rmi.Remote;
public interface DivInterface extends Remote {
	// Declaring the method prototype
	public int div(int x, int y) throws RemoteException;
}
