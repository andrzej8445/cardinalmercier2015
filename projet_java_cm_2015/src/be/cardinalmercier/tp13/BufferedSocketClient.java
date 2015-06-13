package be.cardinalmercier.tp13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class BufferedSocketClient {

  public static void main(String args[]) throws Exception {
    Socket socket1;
    int portNumber = 62900;
    String str = "initialize";

    socket1 = new Socket("127.0.0.1", portNumber);

    BufferedReader br = new BufferedReader(new InputStreamReader(socket1.getInputStream()));

    PrintWriter pw = new PrintWriter(socket1.getOutputStream(), true);

    pw.println(str);

    while ((str = br.readLine()) != null) {
      System.out.println(str);
      pw.println("bye");
      String lol = str;
      System.out.println(lol);
      if (str.equals("bye"))
    	  
        break;
    }

    br.close();
    pw.close();
    socket1.close();
  }

}
