// Creating a MulInterface interface
import java.rmi.Remote;
public interface MulInterface extends Remote {
	// Declaring the method prototype
	public int mul(int x, int y) throws RemoteException;
}
