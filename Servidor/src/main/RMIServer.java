package main;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import consumidor.Consumidor;
import consumidor.ConsumidorRMI;
import produtor.Produtor;
import produtor.ProdutorRMI;


public class RMIServer {
	RMIServer() {
		try {
			LocateRegistry.createRegistry(1212);
			ProdutorRMI p = new Produtor();
			ConsumidorRMI c = new Consumidor();
			Naming.rebind("rmi://127.0.0.1:1212/ProdutorService", p);
			Naming.rebind("rmi://127.0.0.1:1212/ConsumidorService", c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		new RMIServer();
		System.out.println("servidor rmi em execução");
	}
}