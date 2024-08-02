package sub3;
/*
 *  날짜 : 2024/07/24
 *  이름 : 강중원
 *  내용 : Socket 통신 실습하기
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread{
	private Socket socket;
	
	public ReceiveThread(Socket socket) {
		this.socket = socket;
	}
	@Override
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while(true) {
					String msg = br.readLine();
					
					if(msg == null) {
						break;
					}
					System.out.println(msg);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					socket.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
}
