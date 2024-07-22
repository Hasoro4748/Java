package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 날짜 : 2024/07/15
 * 이름 : 강중원
 * 내용 : 예외처리 실습하기
 */
public class ExceptionTest {
	public static void main(String[] args) {
		////////////////////////////////////////
		//	실행 예외 (런타임, 프로그램 실행중 예외발생
		////////////////////////////////////////
		//	예외상황1. 어떤 수를 0으로 나눌때
		int num1 = 1;
		int num2 = 0;
		
		int r1 = num1 + num2;
		int r2 = num1 - num2;
		int r3 = num1 * num2;
		int r4 = 0;
		try {
			r4 = num1 / num2;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		
		//	예외상황2. 배열의 인덱스 참조가 잘못 되었을때
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0 ; i <= 10; i++) {
			try {
				System.out.println("arr[" + i  + "] : " + arr[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();//예외 출력
			}
		}
		
		
		//	예외상황3. 객체 생성 없이 메서드 호출
		Animal ani =null;
		try {
			ani.move();
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
		//	예외상황4. 잘못된 캐스팅
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		Tiger tiger = null;
		Shark shark = null;
		
		try {
			tiger  = (Tiger) a1;
			shark = (Shark) a2; //잘못된 다운캐스팅

			tiger.move();
			shark.move();
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		
		
		////////////////////////////////////////
		//	일반예외(컴파일 타임, 프로그램 실행 전 발생 예외)
		////////////////////////////////////////
		
		//동적 객체 생성
		try {
			//예외가 발생할 수 있는 코드
			Class clazz = Class.forName("sub.Eagle");	//문자열 정보를  가지고 클래스 정보를 로드
			Constructor<?> constructor = clazz.getDeclaredConstructor();	//생성자 선언
			Eagle eagle = (Eagle) constructor.newInstance();	//동적 객체 생성
			
			eagle.move();
			
			
		} catch (ClassNotFoundException e) {
			//예외가 발생 했을때
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//예외 처리 발생 여부와 상관없이 마지막에 항상 실행
			System.out.println("finally 실행");
		}
		
		System.out.println("프로그램 정상 종료");
		
	}
}
