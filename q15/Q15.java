package q15;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ϴ� ������ �Է��ϼ��� : ");
		String msg = scan.nextLine();
		scan.close();
		
		System.out.print("������ �Ųٷ� ����մϴ� : ");
		reverse.print(reverse.reverse(msg));
	}

}
