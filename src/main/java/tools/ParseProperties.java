package tools;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class ParseProperties {
	private Properties pro =new Properties();
	
	
	//构造函数带文件路径
	public ParseProperties (String propertiespath) {
		this.loadProperties(propertiespath);
	}
	//加载Properties文件
	private void loadProperties(String propertiespath ) {
		try {
			InputStream in =new FileInputStream(propertiespath);
			InputStreamReader inr =new InputStreamReader(in);
			BufferedReader br =new BufferedReader(inr);
			pro.load(br);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//获取文件中对应键的value值
	public String getTestDate(String key) {
		String value= pro.getProperty(key).trim();
		
		try {
			value=new String(value.getBytes("UTF-8"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return value;
	}
	
	/**
	 * @param arg
	 * ParseProperties fl =new ParseProperties("E:\works\kerr\src\main\java\testDate\test.properties");
	 */
	public static void main(String[] args) {		
		ParseProperties fl =new ParseProperties(System.getProperty("user.dir")+"\\src\\main\\java\\testDate\\login_date.properties");
		System.out.println(fl.getTestDate("in_btn"));
	}

}





