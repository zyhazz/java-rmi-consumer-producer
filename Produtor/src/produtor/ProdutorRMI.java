package produtor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProdutorRMI extends Remote {
	
	public abstract int getItens()throws RemoteException;
	public abstract void produz()throws RemoteException;

}
