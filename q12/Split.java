package q12;

public class Split {
	public static String[] split(String msg) {
		msg = msg.replaceAll(" ", "");
		char[] array = msg.toCharArray();
		String[] result = new String[2];
		for (int i = 0; i < result.length; i++) {
			result[i] = "";
		}
		
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ',') {
				i++;
				k = 1;
			}
			result[k] += array[i];
		}
		
		return result;
	}
}
