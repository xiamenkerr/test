package tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class randomValue {
	public static String create() {
		SimpleDateFormat suiji= new SimpleDateFormat("YYMMddHHmmss");
		Date now=new Date();	
		String name=suiji.format(now);
		return name;
	}
	
/*	public static void main(String[] args) {
		randomValue.create();
	}*/
}
	
	

