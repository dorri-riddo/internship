package q7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� �Ҽ��� �Է��ϼ��� : ");
		double d = scan.nextDouble();
		System.out.print("�ݿø��ϰ� ���� ��ġ�� �Է��ϼ��� : ");
		int pos = scan.nextInt();
		scan.close();

		Round r = new Round();
		System.out.print(r.roundUp(d, pos));
	}

}
