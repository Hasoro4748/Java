package sub5;

import java.io.File;
import java.io.IOException;

/*
 *  날짜 : 2024/07/18
 *  이름 : 강중원
 *  내용 : 파일 관리 실습하기
 */
public class FileTest {
	public static void main(String[] args) {
		String path1 =  "C:\\Users\\noily\\Desktop\\source.txt";
		String path2 =  "C:\\Users\\noily\\Desktop\\temp";
		
		//File 객체 생성
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		try {
			f1.createNewFile();		//파일 생성
			
			f2.mkdir();							//디렉터리 생성
			
			//파일 정보 출력
			System.out.println("f1 존재여부 : " + f1.exists());
			System.out.println("f2 존재여부 : " + f2.exists());
			System.out.println("f1 파일여부 : " + f1.isFile());
			System.out.println("f1 폴더여부 : " + f1.isDirectory());
			System.out.println("f2 파일여부 : " + f2.isFile());
			System.out.println("f2 폴더여부 : " + f2.isDirectory());
			System.out.println("f1 파일명 : " + f1.getName());
			System.out.println("f2 파일명 : " + f2.getName());
			System.out.println("f1 상대경로 : " + f1.getPath());
			System.out.println("f2 상대경로 : " + f2.getPath());
			System.out.println("f1 절대경로 : " + f2.getAbsolutePath());
			System.out.println("f2 절대경로 : " + f2.getAbsolutePath());
			
			f1.delete();
			f2.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
