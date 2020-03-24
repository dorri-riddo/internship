package q13;

public class Format {
	public static String parse(String msg) {
		String str = msg.replaceAll("\n", " ");
		char[] array = str.toCharArray();
		String result = "";
		for (int i = 0; i < array.length; i++) {
			if ((i + 1) % 72 == 0)
				result += "\n";
			result += array[i];
		}
		
		return result;
	}
}
