package Extends;

public class fatherClass {
	static String china="中国";
	
	static {
		System.out.println("这是父类的静态块");
	}
	
	public fatherClass() {
		System.out.println("这是父类的构造函数");
	}
	
	public void getName() {
		System.out.println("my name is lili");
	}
}
