package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Demo_test.kerr.LoginPage;

public class Test_loginpage {
	
	private WebDriver FF;
	
	@BeforeClass
	public void init() {
		FF=new FirefoxDriver();
		//FF=FFdriver;
		//FF.manage().window().maximize();
	}
	
	@Test
	public void login() {
		LoginPage page=new LoginPage(FF);
		page.getUrl("http://sitcgadmin.fixed-stars.com/S01/login/showLogin.do");
		page.inputName("admin1");
		page.inputPwd("aaaaaa");
		page.clickBtn();
		try {
			page.signOut();
			System.out.println("登录成功");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
