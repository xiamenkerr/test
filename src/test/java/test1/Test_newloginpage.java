package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Demo_test.kerr.NewLoginPage;
import lib.login_lib;

public class Test_newloginpage {
	
	public WebDriver FF;
	
	@BeforeClass
	public void init() {
		FF=new FirefoxDriver();
	}
	
	@Test
	public void newLogin() {
		NewLoginPage newPage=new NewLoginPage(FF);
		newPage.getUrl(login_lib.url).inputName(login_lib.account);	
		/*try {
			newPage.inputPwd(login_lib.password).clickBtn().signOut();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		newPage.inputPwd(login_lib.password).clickBtn().signOut();
	}	
	
}
