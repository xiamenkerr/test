package Demo_test.kerr;

import org.testng.annotations.Test;

import tools.ParseProperties;

public class test_class {
	@Test
	public  void so() {
		ParseProperties fl =new ParseProperties(System.getProperty("user.dir")+"\\src\\main\\java\\testDate\\login_date.properties");
		System.out.println(fl.getTestDate("in_btn"));
	}
}
