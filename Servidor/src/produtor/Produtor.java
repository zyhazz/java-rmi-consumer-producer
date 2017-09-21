package produtor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import buffer.Buffer;

public class Produtor extends UnicastRemoteObject implements ProdutorRMI {
	
	public Produtor() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void produz() {
		Buffer.getInstance().produz();
	}

	public int getItens() {
		return Buffer.getInstance().getBuffer();
	}

}
