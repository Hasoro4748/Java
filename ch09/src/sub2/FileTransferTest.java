package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  날짜 : 2024/07/18
 *  이름 : 강중원
 *  내용 : 직렬화 실습하기
 */

public class FileTransferTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\noily\\Desktop\\workspace.zip";
		String target = "C:\\Users\\noily\\Desktop\\workspace4.zip";
		
		try {
			//입력 스트림 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			//파일 복사
			fis.transferTo(fos);			
			//스트림 해제
			fis.close();
			fos.close();
		} 
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
