package q6;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		double sum = 0;
		for (int i = 0; i < 20; i++) {
			sum += 0.1;
		}
		System.out.println("결과 : " + sum);
		
		/*
		 * 오류 발생
		 * 부동소수점 반올림 오차
		 * 소수의 경우에는 2진수로 표현할 수 없는 경우가 발생한다 거기서 생겨나는 오류
		 */
		
		// BigDecimal 사용
		BigDecimal sum2 = new BigDecimal("0");
		BigDecimal value = new BigDecimal("0.1");
		for (int i = 0; i < 20; i++) {
			sum2 = sum2.add(value);
		}
		System.out.println("부동 소수점 오차 해결 이후 : " + sum2);
		
		// 소수에 큰 수를 곱하고 나중에 나누는 형태
		double sum3 = 0;
		double value2 = 0.1;
		for (int i = 0; i < 20; i++) {
			sum3 += value2 * 10;
		}
		sum3 /= 10;
		System.out.println("부동 소수점 오차 해결2 이후: " + sum3);

	}

}
