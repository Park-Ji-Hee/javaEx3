package ch11.unit02;

public class Ex03 {

	public static void main(String[] args) {
		// Test3<String> t = new Test3<>(); // 아랫것과 동일함, 두 가지 방법 모두 가능
		Test3<String> t = new Test3<String>();
		t.set("서울");
		// t.set(50); // 컴파일 오류 , String 타입이라서
		String s = t.get(); // 캐스팅하지 않음 (원래는 다운캐스팅 해야 됨)
		System.out.println(s);
		
		Test3<Integer> t2 = new Test3<>();
		t2.set(20);
		int n = t2.get();
		System.out.println(n);
		
	}

}

// generic : 하나의 파라미터 타입
class Test3<T> { 	// <> : 대문자, 알파벳 한글자, 타입미정인상태?
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		System.out.println(obj.getClass());
		
		return obj;
	}
}
