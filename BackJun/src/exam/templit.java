package exam;
	import java.io.*;
	public class templit{//Main{//25206
		public static void main(String[] args)throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			 
			int n = Integer.parseInt(br.readLine());
			int sum = 0; //누적
			int line = 1; 	//현재 갯수
			
			while(true) {
				if(n <= line + sum) {	//현재 라인에 존재
					if(line % 2 == 1) {	//홀수
						bw.write(""+ (n - sum) + "/" + (line));
						break;
					}else {//홀수
						bw.write(""+ (line-1) + "/" + (n-sum));
						break;
					}
				}else {
					sum += line;
					line++;
				}
			}
			
			bw.flush();
			bw.close();
	        br.close();
			
		}
	}