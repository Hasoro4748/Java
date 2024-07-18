package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class programmers {
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		
		Map<String,Integer> sum = new HashMap<>();
		for(int i = 0 ; i < genres.length; i++) {
			sum.put(genres[i], sum.getOrDefault(genres[i], 0) + plays[i]);
		}
		
		System.out.println(sum);
		
	}
}
