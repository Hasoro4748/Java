package sub4;
/*
 *  날짜 2024/07/22
 *  이름 : 강중원
 *  내용 : 스레드 제어 실습하기 교재 p617~ 619 
 */
public class ThreaWaitNotifyTest {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
		
	}
}
