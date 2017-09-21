package consumidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConsumidorRMI extends Remote {
	
	public abstract int getItens()throws RemoteException;
	public abstract void consome()throws RemoteException;

}
