package q10;

public class Convert {
	public String convert(String msg) {
		String num = msg.replaceAll("[^0-9]", "");
		char[] array = num.toCharArray();
		
		String result = "";
		
		for (int i = 0; i < array.length; i++) {
			result += array[i];
			
			if (i == 3 || i == 5)
				result += '-';
		}
		
		return result;
	}
}
