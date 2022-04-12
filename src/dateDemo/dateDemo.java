package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		System.out.println(d.toString()); //Mon Apr 11 23:12:54 PDT 2022
		
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		System.out.println(sdf.format(d)); //16/11/2022
		
		SimpleDateFormat sd = new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(d)); //19/11/2022 11:19:09
	}

}
