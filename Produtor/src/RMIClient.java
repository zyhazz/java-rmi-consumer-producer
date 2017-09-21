
import java.rmi.Naming;
import java.rmi.RemoteException;

import produtor.ProdutorRMI;

public class RMIClient {
	public static void main(String[] args) {
		try {
			ProdutorRMI p = (ProdutorRMI) Naming.lookup("//127.0.0.1:1212/ProdutorService");
			Runnable th = new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					while (true) {
						try {
							p.produz();
							Thread.sleep(1000);
						} catch (RemoteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println("nao foi possivel executar");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println("acordou do sono");
						}
					}
				}
			};
			th.run();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}