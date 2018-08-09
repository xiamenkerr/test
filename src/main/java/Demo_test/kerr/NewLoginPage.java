package Demo_test.kerr;

import org.openqa.selenium.WebDriver;

import lib.login_lib;
import tools.find;

public class NewLoginPage {
	
	private WebDriver driver;
	private find go;
	private tools.wait waiting;
	
	public NewLoginPage(WebDriver driver) {
		this.driver=driver;
		go=new find(driver);
		waiting=new tools.wait(driver);
	}
	
	public NewLoginPage getUrl(String url) {
		driver.get(url);
		return this;
	}
	
	public void inputName(String name) {
		go.target_id(login_lib.player).sendKeys(name);
	}
	
	public NewLoginPage inputPwd(String pwd) {
		go.target_id(login_lib.pwds).sendKeys(pwd);
		return this;
	}
	
	public NewLoginPage clickBtn() {
		go.target_name(login_lib.in_btn).click();
		return this;
	}
	
	
	
	public void signOut() {
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		waiting.waitForElementIsEnable(login_lib.signOut);
		driver.quit();
	}
}
