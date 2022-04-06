package Son_61136475_TH64;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class LuongXL extends Thread {
	Socket SocketClient;
	int id =-1;
	
	public LuongXL( Socket SocketClient, int id) {
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
			
			String guitra;
//			while(true) {
//					String nhanchuoi = buffRead.readLine();
//					System.out.print(nhanchuoi);
//					if (nhanchuoi.equals("1"))
//					{
//						guitra = "one";
//					}
//					//String guitra = nhanchuoi;
//					
//					buffWrite.write(guitra + "/n");
//					buffWrite.flush();
//					if (guitra.equals("10"))break;
//				}
			void guitra(String tenfile) throws IOException{
				BufferedReader buffRead = new BufferedReader(fr);
				
				OutputStream osToClient = SK.getOutputStream();
				OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
				BufferedWriter buffWrite = new BufferedWriter(write2client);
				
				String line;
				while ((line=buffWrife.readLine())!= null) {
					buffWrite.write(line);
					buffWrite.flush();
				}
				fr.close();
				}
			SocketClient.close();
			}	
		catch(Exception e) {
				System.err.println(e.getMessage());
			}
	}
			
}