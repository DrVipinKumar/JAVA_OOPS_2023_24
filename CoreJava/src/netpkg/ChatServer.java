package netpkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Server{
	ServerSocket ss;
	Socket s;
	BufferedReader msgByClient;
	Boolean check=true;
	String data;
	String datatoClient;
	PrintWriter out;
	BufferedReader msgToClient=new BufferedReader(new InputStreamReader(System.in));
	Server(){
		try {
			ss=new ServerSocket(9999);
			System.out.println("Waiting for connection on port 9999");
			s=ss.accept();
			out=new PrintWriter(s.getOutputStream(),true);
			msgByClient=new BufferedReader(new InputStreamReader(s.getInputStream()));
			if(s!=null) {
				System.out.println("Connected to client on port 9999");
				while(check) {
					data=msgByClient.readLine();
					if(data.equals("bye"))
						check=false;
					System.out.println("Client>>"+data);
					System.out.println("<<");
					datatoClient=msgToClient.readLine();
					out.println(datatoClient);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	class ChatServer {

	public static void main(String args[]){
	     new Server();
	}
	}
