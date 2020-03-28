package q16;

public class Format {
	public static void judge(String msg) {
		String[] strArr = msg.split("\n");
		
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].indexOf('*') != -1 || strArr[i].indexOf("//") != -1) {
				String tmp = strArr[i].replaceAll(" ", "");
				if (tmp.indexOf('*') == 0 || tmp.indexOf("//") == 0) {
					continue;
				} 
			}
			
			if ((strArr[i].indexOf("/*") != -1 && strArr[i].indexOf("*/") == -1) || (strArr[i].indexOf("/*") == -1 && strArr[i].indexOf("*/") != -1))
				continue;
			
			if (strArr[i].indexOf("//") != -1) {
				String[] tmp = strArr[i].split("//");
				System.out.println(tmp[0]);
				continue;
			} else if (strArr[i].indexOf("/*") != -1 && strArr[i].indexOf("*/") != -1) {
				System.out.println(strArr[i].substring(0, strArr[i].indexOf("/*")) + strArr[i].substring((strArr[i].indexOf("*/") + 2), strArr[i].length()));
				continue;
			}
			System.out.println(strArr[i]);
		}
	}
}
