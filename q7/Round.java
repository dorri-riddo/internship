package q7;

import java.math.BigDecimal;

public class Round {		
	public BigDecimal roundUp(double d, int pos) {
		String strD = "" + d;
		BigDecimal d2 = new BigDecimal(strD);
		
		for (int i = 0; i < pos; i++) {
			d2 = d2.multiply(new BigDecimal("10"));
		}
		
		long intD = d2.longValue();
		int num = (int) (intD % 10);
		intD /= 10;
		
		if (num >= 5) {
			intD++;			
		}
		
		String strIntD = "" + intD;
		BigDecimal result = new BigDecimal(strIntD);
		
		for (int i = 0; i < pos - 1; i++) {
			result = result.divide(new BigDecimal("10"));
		}
		
		return result;
	}
}
