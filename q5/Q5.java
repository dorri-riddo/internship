package q5;

public class Q5 {

	public static void main(String[] args) {
		String str = "2/3*5";
		String regExp = "[-*/+]";
		String regex = "[0-9]";
		
		String[] number = str.split(regExp);
		String[] op = str.split(regex);
		
		double result = Double.parseDouble(number[0]);
		
		for (int i = 1; i < op.length; i++) {
			switch (op[i]) {
			case "+":
				result += Double.parseDouble(number[i]);
				break;
			case "-":
				result -= Double.parseDouble(number[i]);
				break;
			case "*":
				result *= Double.parseDouble(number[i]);
				break;
			case "/":
				result /= Double.parseDouble(number[i]);
				break;
			}
		}

		System.out.print(result);
	}

}
