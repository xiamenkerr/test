package Demo_test.kerr;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import java.lang.*;
import lib.login_lib;

public class login {
	@BeforeMethod
	public void set() {
		System.setProperty("webdriver.firefox.bin","D:/Program Files/Mozilla Firefox/Firefox.exe");
	}
	@Test
	public void getUrl() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get(login_lib.url);
		Thread.sleep(1000);
		driver.findElement(By.id(login_lib.player)).sendKeys(login_lib.account);
		driver.findElement(By.id(login_lib.pwds)).sendKeys(login_lib.password);
		driver.findElement(By.name(login_lib.in_btn)).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
