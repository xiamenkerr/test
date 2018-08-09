package tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Shot {
	public WebDriver driver;
	
	public Shot(WebDriver driver) {
		this.driver=driver;
	}
	
	private void takeScreenShot(String shotpath) {
//		OutputStream album=null;
		TakesScreenshot take=(TakesScreenshot)driver;
		File shot=take.getScreenshotAs(OutputType.FILE);
		//			album=new FileOutputStream(shotpath);
		try {
			FileUtils.copyFile(shot, new File(shotpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void takeScreenShot() {
		String shotName=String.valueOf(randomValue.create())+".jpg";
		File dir=new File("test-output/screenshotpicture");
		if(!dir.exists())
			dir.mkdirs();
		String shotpath=dir.getAbsolutePath()+"/"+shotName;
		this.takeScreenShot(shotpath);
	}
	
}
