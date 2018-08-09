package Extends;

public class sonClass extends fatherClass {
	
	static float a=0.12f;
	
	static {
		System.out.println("这是子类的静态块");
	}
	
	public sonClass() {
//		super();
		System.out.println("这是子类的构造函数");
	}
	
	public void getName() {
		System.out.println("my name is yaya");
		//可以实现对父类方法的重写（重写父类中同名的方法）
	}
	
	public static void main(String[] args) {
		fatherClass a=new sonClass();
		a.getName();
	}
}
