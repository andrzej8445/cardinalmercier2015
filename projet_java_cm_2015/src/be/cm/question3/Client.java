package be.cm.question3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client extends Socket {
	private ObjectInputStream ois;
	private void methodCommuneConstructeur(){
		try{
			ois = new ObjectInputStream(this.getInputStream());
			System.out.println("Le client a recu du serveur :"+ois.readObject());
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
	public Client(){
		methodCommuneConstructeur();
	}
	public Client(String arg0,int arg1) throws UnknownHostException,IOException{
		super(arg0,arg1);
		methodCommuneConstructeur();
	}
	public static void main(String[] args){
		try{
			Client c = new Client("127.0.0.1",2015);
			
		}
		catch(UnknownHostException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}
}
