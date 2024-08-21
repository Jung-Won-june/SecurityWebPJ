package whereismodule;


class B extends Thread { //스레드 클래스 상속
	public void run() {
		System.out.println("B Thread!");
		
	}
}
class C implements Runnable{ //run 포함하는 인터페이스. 스레드 생성자에 객체 전달해서 스레드 생성가능.
	public void run() { //implements는 한 클래스가 하나 이상의 인터페이스 구현할 때 사용. 다중상속 대신에 사용.
		System.out.println("C Thread!");
	}
}

public class SecondApp {
	public static void main(String[] ar) {
		B bp = new B();
		C cp = new C();
		bp.start();
		new Thread(cp).start();
		System.out.println("Main!");
	}
}