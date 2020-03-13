package q3;

import java.util.Scanner;

public class Q3 {
	
	private static int cnt = 0;
	
	public Q3() {
		cnt++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �ν��Ͻ�ȭ �� ��ü ���� : ");
		int n = sc.nextInt();
		
		// 7���� ��ü ����
		Q3[] q3Arr = new Q3[n];
		// ��ü�� �޸𸮿� �Ҵ��Ͽ� �ν��Ͻ� ����
		for (int i = 0; i < q3Arr.length; i++) {
			q3Arr[i] = new Q3();
		}
		
		print();

		System.out.print("�����ϰ� ���� �ν��Ͻ�ȭ �� ��ü ���� : ");
		int m = sc.nextInt();
		
		while (m-- > 0) {
			System.out.print("������ ���ϴ� �ν��Ͻ� : ");
			int k = sc.nextInt();
			q3Arr[k] = (Q3) finalize(q3Arr[k]);
			print();
		}
		
		sc.close();
	}
	
	// �ν��Ͻ� ����
	public static Object finalize(Object o) {
		if (o != null) {
			o = null;
			cnt--;
		}
		return o;
	}
	
	public static void print() {
		System.out.println("�ν��Ͻ�ȭ �Ǿ� ���� ��ü ���� : " + cnt);
	}	
}
