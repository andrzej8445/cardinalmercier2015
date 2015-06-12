package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient extends Socket {
	public MonClient() throws UnknownHostException, IOException{
		super("192.168.1.28",62900);
		System.out.println();
	}
	public MonClient(String ip,int numPort) throws UnknownHostException, IOException{
		super(ip,numPort);
		System.out.println();
	}
	public static void main(String[] args) {
		try {
			MonClient mc = new MonClient("127.0.0.1",62900);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
