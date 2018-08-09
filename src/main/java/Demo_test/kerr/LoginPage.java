package Demo_test.kerr;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage {
	
	private WebDriver driver;
	
	@FindBys(@FindBy(id="adminName|pwd"))
	private List<WebElement> value;
	
	@FindBy(xpath="//*[@id='form']/input[3]")
	private WebElement loginbtn;
	
	@FindBy(id="adminName")
	private WebElement name;
	
	@FindBy(id="pwd")
	private WebElement password;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void inputValue(String values) {
		for(WebElement in :value)
			in.sendKeys(values);
	}
	
	public void inputName( String admin) {
		name.sendKeys(admin);
	}
	
	public void inputPwd(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickBtn() {
		loginbtn.click();
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void signOut() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
		
}
