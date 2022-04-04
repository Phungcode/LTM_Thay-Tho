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
			
			while(true) {
					String nhanchuoi = buffRead.readLine();
					System.out.print(nhanchuoi);
					if (nhanchuoi.equals("1"))
					{
						String guitra = "one";
					}
					//String guitra = nhanchuoi;
					
					buffWrite.write(guitra + "/n");
					buffWrite.flush();
					if (guitra.equals("10"))break;
				}
			SocketClient.close();
			}	
		catch(Exception e) {
				System.err.println(e.getMessage());
			}
	}
			
}