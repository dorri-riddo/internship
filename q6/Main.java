package q6;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 0; i < 20; i++) {
			sum += 0.1;
		}
		System.out.println("��� : " + sum);
		
		/*
		 * ���� �߻�
		 * �ε��Ҽ��� �ݿø� ����
		 * �Ҽ��� ��쿡�� 2������ ǥ���� �� ���� ��찡 �߻��Ѵ� �ű⼭ ���ܳ��� ����
		 */
		
		// BigDecimal ���
		BigDecimal sum2 = new BigDecimal("0");
		BigDecimal value = new BigDecimal("0.1");
		for (int i = 0; i < 20; i++) {
			sum2 = sum2.add(value);
		}
		System.out.println("�ε� �Ҽ��� ���� �ذ� ���� : " + sum2);
		
		// �Ҽ��� ū ���� ���ϰ� ���߿� ������ ����
		double sum3 = 0;
		double value2 = 0.1;
		for (int i = 0; i < 20; i++) {
			sum3 += value2 * 10;
		}
		sum3 /= 10;
		System.out.println("�ε� �Ҽ��� ���� �ذ�2 ����: " + sum3);

	}

}
