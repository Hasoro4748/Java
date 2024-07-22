package sub5;
/*
 *  날짜 2024/07/22
 *  이름 : 강중원
 *  내용 : 데몬 스레드 실습하기
 */

/*
 * 	- 메인 스레드를 보조하는 스레드
 * 	- 메인 스레드가 종료가 되면 데몬 스레드도 같이 종료가 된다
 */

class SubThread extends Thread {
	
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(;;) {
			System.out.println(name + " Thread 실행... ");
			try {
				Thread.sleep(1000);			//스레드 1초대기
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThreadTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread("Sub");
		
		sub.start();
		
		for(int i = 1 ; i<= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main 스레드 실행...");
		}
		System.out.println("main 스레드 종료...");
	}
}
