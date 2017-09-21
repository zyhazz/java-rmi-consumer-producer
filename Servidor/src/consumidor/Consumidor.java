package consumidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import buffer.Buffer;

public class Consumidor extends UnicastRemoteObject implements ConsumidorRMI {
	
	public Consumidor() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void consome() {
		Buffer.getInstance().consome();
	}

	@Override
	public int getItens() {
		return Buffer.getInstance().getBuffer();
	}

}
