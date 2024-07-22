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
 *  내용 : 바이트 배열을 이용한 실습하기
 */

public class ByteArrayBufferTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\noily\\Desktop\\workspace.zip";
		String target = "C:\\Users\\noily\\Desktop\\workspace3.zip";
		//버퍼로 이용한 byte 배열
		byte[] buffer = new byte[1024];
		
		try {
			//입력 스트림 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			
			while(true) {
				//파일 읽기
				int data = fis.read(buffer); //한번에 1KB 단위로 읽기
				
				if(data == -1) {
					//더 이상 읽을 파일 내용이 없을 경우
					break;
				}
				fos.write(buffer, 0 ,data);
			}
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
