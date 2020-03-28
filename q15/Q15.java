package q15;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원하는 문장을 입력하세요 : ");
		String msg = scan.nextLine();
		scan.close();
		
		System.out.print("문장을 거꾸로 출력합니다 : ");
		reverse.print(reverse.reverse(msg));
	}

}
