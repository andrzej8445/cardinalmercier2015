package tp8;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			InetAddress adress;
			try {
				adress = InetAddress.getByName("192.168.1.28");
				System.out.println(adress.isReachable(3000));
				System.out.println(adress.getHostName());
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	

		

	}


}
