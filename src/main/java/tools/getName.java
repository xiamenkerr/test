package tools;

//import java.sql.Date;
import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;
import org.testng.annotations.Test;

public class getName {
	@Test
	/*public void changeName() {
		SimpleDateFormat suiji= new SimpleDateFormat();
		String formats="yyyyMMddHHmmss";
		suiji.applyPattern(formats);
		
		Calendar c1=Calendar.getInstance();
		
		String name=suiji.format(c1.getTime());
		System.out.println(name);
	}*/
	
	public String merchantName() {
		SimpleDateFormat suiji= new SimpleDateFormat("MMddHHmmss");
		Date now=new Date();	
		String name="test"+suiji.format(now);
		return name;
//		System.out.println(name);
	}
	
}
	
	

