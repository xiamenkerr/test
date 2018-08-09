package Demo_test.kerr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import lib.login_lib;
import tools.ParseProperties;

public class login2 {
	public ParseProperties login_date= new ParseProperties(System.getProperty("user.dir")+"\\src\\main\\java\\testDate\\login_date.properties");
/*	@BeforeMethod
	public void set() {
		System.setProperty("webdriver.firefox.bin","D:/Program Files/Mozilla Firefox/Firefox.exe");
	}*/
	@Test
	public void getUrl() throws InterruptedException {
//		System.out.println(login_date.getTestDate("in_btn"));
		WebDriver driver=new FirefoxDriver();
		driver.get(login_date.getTestDate("url"));
		Thread.sleep(1000);
		driver.findElement(By.id(login_date.getTestDate("player"))).sendKeys(login_date.getTestDate("account"));
		driver.findElement(By.id(login_date.getTestDate("pwds"))).sendKeys(login_date.getTestDate("password"));
		driver.findElement(By.name(login_date.getTestDate("in_btn"))).click();
		Assert.assertEquals(driver.getTitle(), "大雄游戏管理系统");
		Thread.sleep(1000);
		driver.quit();
	}
}