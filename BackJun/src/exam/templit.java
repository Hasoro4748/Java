package exam;
	import java.io.*;
	public class templit{//Main{//25206
		public static void main(String[] args)throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			float stuSum = 0f;
			float avgSum = 0f;
			
			
			for(int i = 0; i < 20; i++) {
				float score = 0;
				String input = br.readLine();
				char scoreLatter = input.charAt(input.length()-2);
				if(scoreLatter == 'P') {
					continue;
				}else if(scoreLatter == 'A') {
					if(input.charAt(input.length()-1) == '+') {
						score = 4.5f;
					}else {
						score = 4.0f;
					}
				}else if(scoreLatter == 'B') {
					if(input.charAt(input.length()-1) == '+') {
						score = 3.5f;
					}else {
						score = 3.0f;
					}
				}else if(scoreLatter == 'C') {
					if(input.charAt(input.length()-1) == '+') {
						score = 2.5f;
					}else {
						score = 2.0f;
					}
				}else if(scoreLatter == 'D') {
					if(input.charAt(input.length()-1) == '+') {
						score = 1.5f;
					}else {
						score = 1.0f;
					}
				}else {		//F
					score = 0.0f;
				}
				float point = input
				avgSum = point*score;
			}
			
			
			
			bw.flush();
			bw.close();
	        br.close();
			
		}
	}