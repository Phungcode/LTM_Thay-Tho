package Son_61136475_TH64;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.OutputStream;
	import java.io.OutputStreamWriter;
	import java.net.Socket;
	import java.util.Scanner;

	public class Client {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Socket SK;
			try {
				SK = new Socket ("localhost",2001);
				System.out.print("Đã được kết nối....... \n");
				
//				InputStream in = SK.getInputStream();
//				InputStreamReader inRead = new InputStreamReader(in);
//				BufferedReader buffRead = new BufferedReader(inRead);
//				
//				OutputStream osToClient = SK.getOutputStream();
//				OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
//				BufferedWriter buffWrite = new BufferedWriter(write2client);
				
//				Scanner  banphim = new Scanner(System.in);
//			
//				while(true) {
//					System.out.print("\n Client: ");
//					String guitra = banphim.nextLine();
//					
//					buffWrite.write(guitra +"\n");
//					buffWrite.flush();
//					
//					String nhanchuoi = buffRead.readLine();
//					System.out.print("Server" +nhanchuoi);
//					
//					if(guitra.equals("10")) break;
//				}
				
				void Guifile(String tenfile)throws IOException{
				BufferedReader buffRead = new BufferedReader(fr);
				
				OutputStream osToClient = SK.getOutputStream();
				OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
				BufferedWriter buffWrite = new BufferedWriter(write2client);
				
				String line;
				while ((line=buffWrife.readLine())!= null) {
					
				}
				}
			SK.close();
			}
			catch (IOException e) {

				System.out.print("Đã ngắt kết nối....");
				e.printStackTrace();
			}
		}

	}

}
