// Creating a AddInterface interface
import java.rmi.Remote;
public interface AddInterface extends Remote {
	// Declaring the method prototype
	public int add(int x, int y) throws RemoteException;
}
