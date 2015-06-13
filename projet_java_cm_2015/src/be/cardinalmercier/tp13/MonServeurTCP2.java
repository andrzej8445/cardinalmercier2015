package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.*;
import java.net.*;
import java.util.*;

public class MonServeurTCP2 extends ServerSocket implements Runnable {
	private int numPort;
	private Socket client;
	public MonServeurTCP2() throws IOException {
		super(Param.numPort);
		numPort = Param.numPort;
		
		Thread t = new Thread(this);
		t.start();
		
		//client = this.accept();
		// TODO Auto-generated constructor stub
	}
	public MonServeurTCP2(int Port) throws IOException {
		super(Port);
		numPort = Port;
		Thread t = new Thread(this);
		t.start();
		//client = this.accept();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		MonServeurTCP2 ms = null;
		int i;
		for(i = Param.numPort; i<65535; i++){
			try {
				ms = new MonServeurTCP2();
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
				client = this.accept();
			InputStreamReader inputstreamreader = new InputStreamReader(client.getInputStream());
		      BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
		      PrintWriter printwriter = new PrintWriter(client.getOutputStream(),true);
		      printwriter.println("You connected to the Simple Server at ");
		      printwriter.println("Send Bye to disconnect.");
			System.out.println("**** un nnouveu client s'est connecte****");
			bufferedreader.close();
		      inputstreamreader.close();
		      printwriter.close();
		      client.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
