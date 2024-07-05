package exam;
	import java.io.*;
	public class templit{//Main{//25206
		public static void main(String[] args)throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			 
			int maxsize = 0;
			String[] input = new String[5];
			for(int i =0; i < 5; i++) {
				input[i] = br.readLine();
				if(input[i].length() > maxsize) {
					maxsize = input[i].length();
				}
			}
			for(int i = 0; i < maxsize; i++) {
				for(int j = 0; j < 5; j++) {
					if(input[j].length() <= i) {
						continue;
					}
					bw.write(""+input[j].charAt(i));
				}
			}
			
			
			bw.flush();
			bw.close();
	        br.close();
			
		}
	}