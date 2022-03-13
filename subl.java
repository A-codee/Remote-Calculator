// Creating a SubInterface interface
import java.rmi.Remote;
public interface SubInterface extends Remote {
	// Declaring the method prototype
	public int sub(int x, int y) throws RemoteException;
}
