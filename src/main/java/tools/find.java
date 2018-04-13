package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class find {
	
	private WebDriver driver;
	private WebElement element=null;
	

	public find(WebDriver ff) {
		this.driver=ff;
	}
	
	//findElement-By.id
	public WebElement target_id(String id) {
		try {
			element=driver.findElement(By.id(id));
			System.out.println("成功了，id找到了");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("失败了，id没找到");
		}	
		return element;
	}
	
	//findElement-By.name
	public WebElement target_name(String name) {
		try {
			element=driver.findElement(By.name(name));
			System.out.println("成功了，name找到了");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("失败了，name没找到");
		}
		return element;
	}
	
	//findElement-By.xpath
	public WebElement target_xpath(String xpath) {
		try {
			element=driver.findElement(By.xpath(xpath));
			System.out.println("成功了，xpath找到了");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("失败了，xpath没找到");
		}
		return element;
		}
	
	
}
