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
 *  내용 : 버퍼 보조 스트림 실습하기
 */
public class BufferdStreamTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\noily\\Desktop\\workspace.zip";
		String target = "C:\\Users\\noily\\Desktop\\workspace2.zip";
		try {
			//입력 스트림 연결
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			//보조 스트림 
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				//파일 읽기
				int data = bis.read();
				
				if(data == -1) {
					//더 이상 읽을 파일 내용이 없을 경우
					break;
				}
				//char chr = (char)data;
				//파일 읽은 내용 그래도 출력
				//System.out.println(chr);
				
				bos.write(data);
			}
			
			//버퍼 비우기
			bos.flush();
			
			//스트림 해제
			bis.close();
			bos.close();
			
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
