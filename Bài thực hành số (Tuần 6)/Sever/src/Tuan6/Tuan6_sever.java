<<<<<<< HEAD
package Tuan6;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Tuan6_sever extends Thread {
	Socket SocketClient;
	int id =-1;
	
	public Tuan6_sever( Socket SocketClient, int id) {
		super();
		this.SocketClient = SocketClient;
		this.id = id;
	}
	
	@Override
	public void run() {
		try {
			System.out.print(SocketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = SocketClient.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWrite = new BufferedWriter(write2client);
			
			InputStream in = SocketClient.getInputStream();
			InputStreamReader inRead = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inRead);
			
			while(true){
				String chuoiNhan=buffR.readLine();
				System.out.print(chuoiNhan);

				if (nhanchuoi.equals("0"))
					{
						String guitra = "zero";
					}else if(chuoiNhan.equals("1")) {
					String chuoiGui= "one";
					}else if(chuoiNhan.equals("2")) {
					String chuoiGui= "two";
					}else if(chuoiNhan.equals("")) {
					String chuoiGui= "three";
					}else if(chuoiNhan.equals("4")) {
					String chuoiGui= "for";
					}else if(chuoiNhan.equals("5")) {
					String chuoiGui= "five";
					}else if(chuoiNhan.equals("6")) {
					String chuoiGui= "Six";
					}else if(chuoiNhan.equals("7")) {
					String chuoiGui= "Seven";
					}else if(chuoiNhan.equals("8")) {
					String chuoiGui= "Eight";
					}else if(chuoiNhan.equals("9")) {
					String chuoiGui= "Nine";
					}

					buffWrite.write(guitra + "/n");
					buffWrite.flush();
					if (guitra.equals("10"))break;
				
				}
				
			}
			socketClient.close();
			}	
		catch(Exception e) {
				System.err.println(e.getMessage());
			}
	}
			
=======
package Tuan6;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Tuan6_sever extends Thread {
	Socket SocketClient;
	int id =-1;
	
	public Tuan6_sever( Socket SocketClient, int id) {
		super();
		this.SocketClient = SocketClient;
		this.id = id;
	}
	
	@Override
	public void run() {
		try {
			System.out.print(SocketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = SocketClient.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWrite = new BufferedWriter(write2client);
			
			InputStream in = SocketClient.getInputStream();
			InputStreamReader inRead = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inRead);
			
			while(true){
				String chuoiNhan=buffR.readLine();
				System.out.print(chuoiNhan);

				if (nhanchuoi.equals("0"))
					{
						String guitra = "zero";
					}else if(chuoiNhan.equals("1")) {
					String chuoiGui= "one";
					}else if(chuoiNhan.equals("2")) {
					String chuoiGui= "two";
					}else if(chuoiNhan.equals("")) {
					String chuoiGui= "three";
					}else if(chuoiNhan.equals("4")) {
					String chuoiGui= "for";
					}else if(chuoiNhan.equals("5")) {
					String chuoiGui= "five";
					}else if(chuoiNhan.equals("6")) {
					String chuoiGui= "Six";
					}else if(chuoiNhan.equals("7")) {
					String chuoiGui= "Seven";
					}else if(chuoiNhan.equals("8")) {
					String chuoiGui= "Eight";
					}else if(chuoiNhan.equals("9")) {
					String chuoiGui= "Nine";
					}

					buffWrite.write(guitra + "/n");
					buffWrite.flush();
					if (guitra.equals("10"))break;
				
				}
				
			}
			socketClient.close();
			}	
		catch(Exception e) {
				System.err.println(e.getMessage());
			}
	}
			
>>>>>>> 2b6e4d7c7a590cbd76a0058aefda6f13d28fe7ec
}