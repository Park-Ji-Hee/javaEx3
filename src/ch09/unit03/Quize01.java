package ch09.unit03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
	첫 번째 수 ? 10
	두 번째 수 ? 5
	연산자 ? +
	10 + 5 = 15
	
	연산자는 + - * / % 가 가능하고 모두 정수로 처리
	예외 처리 최대로 활용
*/

public class Quize01 {

	public static void main(String[] args) {
		Calculate c = new Calculate();

		c.calc();
	}
}

// 사용자 정의 예외 클래스
class OperatorException extends Exception {
	private static final long serialVersionUID = 1L;

	public OperatorException() {

	}

	public OperatorException(String msg) {
		super(msg);
	}
}

class Calculate {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void calc() {
		int a, b;
		String op, s;

		try {
			System.out.println("첫번째 수 ? ");
			a = Integer.parseInt(br.readLine()); // NumberFormatException 발생

			System.out.println("두번째 수 ? ");
			b = Integer.parseInt(br.readLine());

			System.out.println("연산자 ? ");
			op = inputOperator();

			s = result(a, b, op);

			System.out.println(s);

		} catch (NumberFormatException e) {
			System.out.println("두수는 숫자만 입력 가능합니다.");
		} catch (OperatorException e) {
			System.out.println("연산자 입력 오류 입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected String inputOperator() throws OperatorException, IOException {
		String op = null;

		op = br.readLine(); // checked exception : IOException / ****** try-cath 안해도 됨... 왜 해야되고 왜 안해도 되지?

		if (!op.matches("(\\+|+\\-+|\\*+|\\/+|\\%)")) {
			throw new OperatorException("연산자 입력 오류...");
		}

		return op;
	}

	protected String result(int a, int b, String op) {
		String s = null;

		try {
			switch (op) {
			case "+":
				s = String.format("%d + %d = %d", a, b, a + b);
				break;
			case "-":
				s = String.format("%d - %d = %d", a, b, a - b);
				break;
			case "*":
				s = String.format("%d * %d = %d", a, b, a * b);
				break;
			case "/":
				s = String.format("%d / %d = %d", a, b, a / b);
				break;
			case "%":
				s = String.format("%d %% %d = %d", a, b, a % b);
				break; // %는 문자그대로 인식하려면 %%라고 해야 됨
			}
		} catch (Exception e) {
			throw e;
		}

		return s;
	}

}
