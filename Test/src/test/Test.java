package test;

public class Test {
	int a=17;
	int b=22;
	void run() {
		System.out.printf("%d + %d = %d", a, b, a+b);
	}
	public static void main(String[] args) {
		Test mymain = new Test();
		mymain.run();
	}
	
}
