package sub2;

import java.util.Scanner;

/*
 *  날짜 : 2024/07/15
 *  이름 : 강중원
 *  내용 : 예외 던지기 실습하기
 */
public class ThrowsTest {
	public static void main(String[] args) {
		int num = 1;
		
		try {
			//method1에서 예외가 발생하면 예외처리
			method1(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("시스템 종료..");
	}
	//method1에서 예외가 발생하면 method1을 호출하는 곳으로 예외 던지기
	public static void method1(int num) throws Exception { //받은 예외처리를 다시 던진다.
		method2(num);
	}
	//method2에서 예외가 발생하면 method2를 호출하는 곳으로 예외 던지기
	public static void method2(int num)  throws Exception{ //두가지의 예외처리를 Exception으로 업캐스팅
		Scanner scan = new Scanner(System.in);
		System.out.println("num2 입력 : ");
		
		int num2  = scan.nextInt();		//InputMismatchException 발생
		int result = num / num2;			//ArithmeticException 발생
		
		System.out.println("result  : " + result);
	}
}
