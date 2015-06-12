package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MonServeurTCP extends ServerSocket implements Runnable {
	private int numPort;
	private ArrayList<Socket> tabClient = new ArrayList<Socket>();
	public MonServeurTCP() throws IOException {
		super(Param.numPort);
		numPort = Param.numPort;
		
		Thread t = new Thread(this);
		t.start();
		
		//client = this.accept();
		// TODO Auto-generated constructor stub
	}
	public MonServeurTCP(int Port) throws IOException {
		super(Port);
		numPort = Port;
		Thread t = new Thread(this);
		t.start();
		//client = this.accept();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		MonServeurTCP ms = null;
		int i;
		for(i = Param.numPort; i<65535; i++){
			try {
				ms = new MonServeurTCP();
				System.out.println("le serveur écoute sur le port : "+Param.numPort);
				break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Param.numPort++;
			}
			
		}
		if(i == 65535){
			System.out.println("aucune port disponible");
		}
	}
	@Override
	public void run() {
		try {
			System.out.println("**** On attend un client****");
			while(! this.isClosed()){
			tabClient.add(this.accept());
			System.out.println("**** un nnouveu client s'est connecte****");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
