package Demo_test.kerr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import lib.login_lib;
import tools.ScreenShot;
import tools.Shot;
import tools.deleteFile;

public class login {
	@BeforeMethod
	public void set() {
		System.setProperty("webdriver.firefox.bin","D:/Program Files/Mozilla Firefox/Firefox.exe");		
	}
	@Test
	public void getUrl() throws InterruptedException {
		deleteFile file=new deleteFile("E:\\works\\kerr\\test-output\\screenshotpicture");
		file.doDelete();
		WebDriver driver=new FirefoxDriver();
/*		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript(arg0, arg1);*/
		driver.get(login_lib.url);
		Thread.sleep(1000);
		driver.findElement(By.id(login_lib.player)).sendKeys(login_lib.account);
		driver.findElement(By.id(login_lib.pwds)).sendKeys(login_lib.password);			
		try {
			driver.findElement(By.name(login_lib.in_btn)).click();		
		} catch (Exception e) {
			// TODO: handle exception	
//			ScreenShot makeShot=new ScreenShot(driver);
//			makeShot.takeScreenShot();
			Shot makeShot=new Shot(driver);
			makeShot.takeScreenShot();
		}		
		Thread.sleep(1000);
		driver.quit();
//		driver.close();
	}
}
