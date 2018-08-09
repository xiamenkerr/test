package Demo_test.kerr;

import org.testng.annotations.*;

public class learn {
	
/*	@Test(groups="submodule1")
	public void test1() {
		System.out.println("这是Test1");
	}
	
	@Test(groups="submodule2")
	public void test2() {
		System.out.println("这是Test2");
	}
	
	@Test(groups="submodule3")
	public void test3() {
		System.out.println("这是Test3");
	}*/
	
	@Parameters({"testdate"})
	@Test
	public void test(@Optional("我是默认的参数") String testdate) {
		System.out.println(testdate);
	}
	
	
}

