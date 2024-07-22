package sub4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *  날짜 : 2024/07/16
 *  이름 : 강중원
 *  내용 : Set 실습하기
 */
public class SetTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(int n : set) {
			System.out.println(n);
		}
	
	}
}
