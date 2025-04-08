package ch09.unit03;

public class Ex16 {

	public static void main(String[] args) {
		User16 obj = new User16();
		
		/*
		obj.setValue(-10);
			// value가 0보다 적으면 RuntimeException 예외가 발생
			// 예외처리 하지 않아 프로그램은 이곳에서 비정상적인 종료
		int n = obj.getValue();
		System.out.println(n);
		
		System.out.println("end...");
		*/
		
		try {
			obj.setValue(-10);
			int n = obj.getValue();
			System.out.println(n);
			
		} catch (Exception e) {
			System.out.println(e.toString());  // e.toString() :  예외 클래스의 정보를 문자열로 출력
		}

	}

}

// unchecked exception throw
class User16 {
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		if(value < 0) {
			// unchecked 예외를 throw
			throw new RuntimeException("0 이상만 가능합니다.");
		}
		
		this.value = value;
	}
}
