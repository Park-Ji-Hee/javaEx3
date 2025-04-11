package ch10.unit02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
  - Class 클래스
  	클래스나 인터페이스에 대한 메타정보를 검색할 수 있는 메소드 제공
  - Class 객체를 얻기 위한 3가지 방법
  	Class<?> c1 = 클래스이름.class; // ?는 getter는 쓸 수 있음, setter는 쓸 수 없음
  	Class<?> c2 = Class.forName("패키지명.클래스이름");
  	Class<?> c3 = 객체참조변수.getClass();
*/

public class Ex01_Class {

	public static void main(String[] args) {
		// String 클래스의 정보 확인
		
		try {
			//Class<?> cls = String.class; 
			Class<?> cls = Class.forName("java.lang.String"); // ClassNotFoundException 있어서 try-catch 해야됨
						// 런타임시 문자열로 클래스정보를 넘기는 경우 풀패키지명을 포함해야 한다.
			
			// 패키지, 클래스
			System.out.println("패키지 정보...");
			System.out.println("패키지명 : " + cls.getPackage().getName()); 	// 패키지명 : java.lang
			System.out.println("패키지명 : " + cls.getPackageName()); 			// 패키지명 : java.lang
			System.out.println("간단한 클래스명 : " +cls.getSimpleName());		// 간단한 클래스명 : String
			System.out.println("전체 클래스명 : " +cls.getName());				// 전체 클래스명 : java.lang.String
			
			System.out.println("\n상위 클래스");
			if(cls.getSuperclass() != null) {
				System.out.println("상위클래스 : " + cls.getSuperclass().getName()); // 상위클래스 : java.lang.Object
			}
			
			
			// 인터페이스
			System.out.println("\n구현한 인터페이스...");
			for(Class<?> c : cls.getInterfaces()) {
				System.out.println(c.getName());
			}
			
			
			// 생성자
			System.out.println("\n생성자...");
			Constructor<?>[] cc = cls.getConstructors();
			for(Constructor<?> c : cc) {
				System.out.println(c);
			}
			
			
			// 필드
			System.out.println("\n필드...");
			//Field[] ff = cls.getFields();			// public 필드만
			Field[] ff = cls.getDeclaredFields(); 	// private 필드 포함
			for(Field f : ff) {
				System.out.println(f + " | ");
				System.out.println(f.getType().getSimpleName() + " | " + f.getName());
			}
			
			// 메소드
			System.out.println("\n메소드...");
			// Method[] mm = cls.getMethod(); // public 메소드만
			Method[] mm = cls.getDeclaredMethods(); // private 메소드
			for(Method m : mm) {
				System.out.println(m);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
