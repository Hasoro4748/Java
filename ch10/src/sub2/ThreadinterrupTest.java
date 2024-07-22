package sub2;
/*
 *  날짜 2024/07/22
 *  이름 : 강중원
 *  내용 : 스레드 상태 실습하기
 */
class SubThread extends Thread{
	
	@Override
	public void run() {
		int i = 1;
		try {

				for(;;) {
					System.out.println("Sub Thread 실행... " + i);
					i++;				
					Thread.sleep(1000);			//스레드 1초대기
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}

public class ThreadinterrupTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		sub.start();
		
		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sub.interrupt();
		
		System.out.println("프로그램 종료...");
		
	}
}
