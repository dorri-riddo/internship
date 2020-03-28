package q15;

public class Reverse {
	public String[] reverse(String msg) {
		String[] strArr = msg.split(" ");
		String[] temp = new String[strArr.length];
		
		for (int i = strArr.length - 1; i >= 0; i--) {
			temp[strArr.length - 1 - i] = strArr[i];
		}
		
		return temp;
	}
	
	public void print(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
	}
}
