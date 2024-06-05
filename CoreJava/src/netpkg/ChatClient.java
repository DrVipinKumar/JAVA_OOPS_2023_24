package netpkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class Client{
	Socket s;
	BufferedReader msgByServer;
	Boolean check=true;
	String data;
	String datatoServer;
	PrintWriter out;
	BufferedReader msgToServer=new BufferedReader(new InputStreamReader(System.in));
	Client(){
		try {
			s=new Socket(InetAddress.getLocalHost(),9999);
			out=new PrintWriter(s.getOutputStream(),true);
			msgByServer=new BufferedReader(new InputStreamReader(s.getInputStream()));
			if(s!=null) {
				System.out.println("Connected to Server on port 9999");
				while(check) {
					System.out.println("<<");
					datatoServer=msgToServer.readLine();
					out.println(datatoServer);
					data=msgByServer.readLine();
					if(data.equals("bye"))
						check=false;
					System.out.println("Server>>"+data);
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	class ChatClient {

	public static void main(String args[]){
	   new Client();
		}
	}
