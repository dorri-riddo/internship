package q3;

import java.util.Scanner;

public class Q3 {
	
	private static int cnt = 0;
	
	public Q3() {
		cnt++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 인스턴스화 된 객체 개수 : ");
		int n = sc.nextInt();
		
		// 7개의 객체 생성
		Q3[] q3Arr = new Q3[n];
		// 객체를 메모리에 할당하여 인스턴스 생성
		for (int i = 0; i < q3Arr.length; i++) {
			q3Arr[i] = new Q3();
		}
		
		print();

		System.out.print("삭제하고 싶은 인스턴스화 된 객체 개수 : ");
		int m = sc.nextInt();
		
		while (m-- > 0) {
			System.out.print("삭제를 원하는 인스턴스 : ");
			int k = sc.nextInt();
			q3Arr[k] = (Q3) finalize(q3Arr[k]);
			print();
		}
		
		sc.close();
	}
	
	// 인스턴스 삭제
	public static Object finalize(Object o) {
		if (o != null) {
			o = null;
			cnt--;
		}
		return o;
	}
	
	public static void print() {
		System.out.println("인스턴스화 되어 사용된 객체 개수 : " + cnt);
	}	
}
