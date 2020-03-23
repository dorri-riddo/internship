package q10;

import java.text.*;
import java.util.Date;

public class Compare {
		
	public String compare(String msg, String msg2) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sf.parse(msg);
		Date d2 = sf.parse(msg2);
		
		if (d1.compareTo(d2) > 0) {
			return msg + " is after " + msg2;
		} else {
			return msg2 + " is after " + msg;
		}
	}
}
