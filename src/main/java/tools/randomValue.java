package tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class randomValue {
	public static String create() {
		SimpleDateFormat suiji= new SimpleDateFormat("YYMMdd-HH-mm-ss");
		Date now=new Date();	
		String name=suiji.format(now);
		System.out.println(name);
		return name;
	}
	
	public static void main(String[] args) {
		randomValue.create();
	}
}
	
	

