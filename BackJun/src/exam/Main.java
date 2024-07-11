package exam;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Main{
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		String input = br.readLine();
		
		
		HashMap<Integer,Integer> hashA = new HashMap<>();
		int len = 1;
		for(int i = 0 ; i <= input.length(); i++) {
			for(int j = 0 ; j + i <= input.length(); j++) {
				
			}
		}
				
		bw.write("\n");
		
		bw.flush();
		bw.close();
		br.close();

	}
}