package q14;

public class Align {
	
	public static void leftAlign(String msg) {
		StringBuilder sb = new StringBuilder();
		String[] strArr = msg.split("\n");
		
		for (int i = 0; i < strArr.length; i++) {
			char[] chArr = strArr[i].toCharArray();
			for (int j = 0; j < chArr.length; j++) {
				if ((j + 1) % 70 == 0 && chArr[j] != '\n')
					sb.append("\n");
				sb.append(chArr[j]);
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}
	
	public static void centerAlign(String msg) {
		StringBuilder sb = new StringBuilder();
		String[] strArr = msg.split("\n");
		
		for (int i = 0; i < strArr.length; i++) {
			char[] chArr = strArr[i].toCharArray();
			int length = strArr[i].length();
			int num = 0;
			int cnt = -1;
			
			while (length > 0) {
				int left = (70 - length) / 2;
				if (left > 0) {
					for (int j = 0; j < left; j++) {
						sb.append(' ');
					}
					for (int j = num; j < chArr.length; j++) {
						sb.append(chArr[j]);
						num++;
					}
				} else {
					cnt++;	
					for (int j = cnt * 70; j < (cnt + 1) * 70; j++) {
						sb.append(chArr[j]);
						num++;
					}
				}
				length -= 70;
				sb.append("\n");
			}
		}
	
		System.out.println(sb.toString());
	}
	
	public static void rightAlign(String msg) {
		StringBuilder sb = new StringBuilder();
		String[] strArr = msg.split("\n");
		
		for (int i = 0; i < strArr.length; i++) {
			char[] chArr = strArr[i].toCharArray();
			int length = strArr[i].length();
			int cnt = -1;
			int num = 0;	
			while(length > 0) {
				int left = 70 - length;
				if (left > 0) {
					for (int j = 0; j < left; j++) {
						sb.append(' ');
					}
					for (int j = num; j < chArr.length; j++) {
						sb.append(chArr[j]);
						num++;
					}
				} else {
					cnt++;	
					for (int j = cnt * 70; j < (cnt + 1) * 70; j++) {
						sb.append(chArr[j]);
						num++;
					}
				}
				length -= 70;
				sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
	
}
