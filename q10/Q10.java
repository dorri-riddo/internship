package q10;

import java.text.ParseException;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) throws ParseException {
		// yyyy MM dd �� �Է¹��� ���� 
		// �� ���¸� ���߸� �߰��� - / �� ������ �������
		Scanner sc  = new Scanner(System.in);
		String msg = sc.nextLine();
		String msg2 = sc.nextLine();
		sc.close();
		
		Convert cv = new Convert();
		Compare cp = new Compare();
		System.out.print(cp.compare(cv.convert(msg), cv.convert(msg2)));

	}

}
