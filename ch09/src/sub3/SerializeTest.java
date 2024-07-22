package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *  날짜 : 2024/07/18
 *  이름 : 강중원
 *  내용 : 역직렬화 실습하기
 */
public class SerializeTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\noily\\Desktop\\apple.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			//직렬화 객체를 내보내기 위한 보조스트림
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 객체 직렬화(내보내기)
			
			Apple apple = (Apple)ois.readObject();
			
			apple.show();
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
