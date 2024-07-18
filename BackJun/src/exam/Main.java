package exam;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Main{
	
	static char[][] arr;
	
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int input =Integer.parseInt(br.readLine());
		int small = 0;
		int gap =0;
		int[] arr = new int[input];
		for(int i = 0 ; i < input; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < input-1 ; i++) {
			int tmp = arr[i+1] - arr[i];
			small = findGCD(tmp, small);
		}
		bw.write(arr[input-1] - arr[0] / small + 1 - (arr.length) + "");
		bw.flush();
		bw.close();
	}
	static int findGCD(int A, int B){
        while(B != 0){
            int R = A%B;
            A = B;
            B = R;
        }
        return A;
    }
}