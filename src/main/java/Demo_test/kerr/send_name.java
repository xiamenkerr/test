package Demo_test.kerr;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import lib.login_lib;
import tools.getName;

public class send_name {
	@BeforeClass
	public void send() {
		getName merchant= new getName();
		String mer=merchant.merchantName();
		System.out.println(mer);
	}
	
	
	@Test
	public void getXpath() {
		 String a=login_lib.url;
		 System.out.println(a);
	}
	
}
