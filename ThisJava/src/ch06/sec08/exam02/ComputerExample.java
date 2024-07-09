package ch06.sec08.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		System.out.println("result : " + myCom.sum(new int[] {1,2,3}));
		System.out.println("result : " + myCom.sum(new int[] {1,2,3,4,5}));
	}
}
