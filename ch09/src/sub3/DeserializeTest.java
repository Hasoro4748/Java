package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 *  날짜 : 2024/07/18
 *  이름 : 강중원
 *  내용 : 역직렬화 실습하기
 */
public class DeserializeTest {
	public static void main(String[] args) {
		Apple apple = new Apple("한국", 3000);
		
		String path = "C:\\Users\\noily\\Desktop\\apple.txt";
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			//직렬화 객체를 내보내기 위한 보조스트림
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체 직렬화(내보내기)
			oos.writeObject(apple);
			
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
