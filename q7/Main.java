package q7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 소수를 입력하세요 : ");
		double d = scan.nextDouble();
		System.out.print("반올림하고 싶은 위치를 입력하세요 : ");
		int pos = scan.nextInt();
		scan.close();

		Round r = new Round();
		System.out.print(r.roundUp(d, pos));
	}

}
