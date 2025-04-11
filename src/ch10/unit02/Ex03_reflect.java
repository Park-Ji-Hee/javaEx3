package ch10.unit02;

import java.lang.reflect.Constructor;

public class Ex03_reflect {

	public static void main(String[] args) {
		String className = "ch10.unit02.TestImlp"; 
		
		try {
			// 기존 객체생성방법 - TestImpl의 객체만 형성
			// Test t = new TestImpl();
			
			
			Class<?> cls = Class.forName(className);
			// 새로운 객체 생성
			// Constructor<?> con = cls.getConstructor(); 	// 런타임 오류 (원래 getConstructor 은 public만 가져옴)
			Constructor<?> con = cls.getDeclaredConstructor();
								// private 디폴트 생성자의 정보도 가져옴
			Test t = (Test)con.newInstance();
			
			
			int s = t.sum(10, 5);
			t.print("합", s);
			
		} catch (ClassNotFoundException e) {
			// 클래스가 존재하지 않는 경우 
			e.printStackTrace();
		} catch (InstantiationError e) {
			// 객체를 생성할 수 없는 경우
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

interface Test {
	public int sum(int  a, int b);
	public void print(String title, int result);
}

class TestImpl implements Test { // 인터페이스 구현클래스에 메소드 오버라이드 꼭 해야함

	@Override
	public int sum(int a, int b) {
		return a +  b;
	} 

	@Override
	public void print(String title, int result) {
		System.out.println(title + " -> " + result);
	}
	
}