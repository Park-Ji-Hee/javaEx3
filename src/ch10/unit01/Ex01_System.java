package ch10.unit01;

import java.util.Scanner;

public class Ex01_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, s;
		
		try {
			while(true) {
				System.out.print("수 ? ");
				n = sc.nextInt();
				
				if(n <= 10) {
					// return; 
						//finally 블럭 실행 됨
						// finally 블럭 실행 안됨
						// main 메소드를 빠져나감
						// main()이 종료된다고 프로그램이 종료되는 것은 아님
						// main()이 프로그램 시작점이지 종료점은 아니다.
					
					System.exit(0); // 안에 있는 숫자는 아무거나 써도 상관없음
						// 프로그램 강제 종료
						// finally 블럭 실행 안됨
				}
				
				s = 0;
				for(int i = 1; i <= n; i++) {
					System.out.println("결과 : " + s);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block...");
			
			sc.close();
		}
		
		System.out.println("end...");

	}

}
