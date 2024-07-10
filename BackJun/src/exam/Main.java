package exam;
import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		
		int N = Integer.parseInt(br.readLine());
		
		
		
		HashMap<String,Integer> hash = new HashMap<>();
		
		for(int i = 1 ; i <= N; i++) {
			String[] tmp = br.readLine().split(" ");
			
			if(hash.containsKey(tmp[0])) {
				
			}
			hash.put(tmp,1);
			
		}
		
		bw.flush();
		bw.close();
		br.close();

	}
}