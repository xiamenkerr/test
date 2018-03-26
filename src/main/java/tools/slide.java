package tools;
//操作页面拉杆元素方法
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class slide {
	public void slideTo(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,600)", "");
	}
}
