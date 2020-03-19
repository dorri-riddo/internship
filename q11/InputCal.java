package q11;

import java.util.Scanner;

public class InputCal {
	private int year, month;
	private Scanner scan = new Scanner(System.in);

	public int inputYear() {
		while(true) {
			System.out.println("원하는 연도를 입력하세요 : ");
			year = scan.nextInt();
			if (year >= 1)
				break;
			System.out.println("정확하게 입력하세요");
		}
		
		return year;

	}
	
	public int inputMonth() {
		while (true) {
			System.out.println("원하는 달을 입력하세요 : ");
			month = scan.nextInt();
			if (month >= 1 && month <= 12)
				break;
			System.out.println("정확하게 입력해주세요");
		}
		return month;
	}
}
