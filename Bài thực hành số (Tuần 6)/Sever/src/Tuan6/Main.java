package Tuan6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket SocketServer =new ServerSocket(2001);
		System.out.println("Dang ket noi tren cong 2001 .....");
		
		int id=0;
		while (true) {
			Socket s = SocketServer.accept();
			id++;
			Tuan6_sever Task =new Tuan6_sever(s,id);
			Task.start();
		}
	}

}
