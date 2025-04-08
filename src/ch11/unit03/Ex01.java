package ch11.unit03;

public class Ex01 {

	public static void main(String[] args) {
		Test1<Number> t = new Test1<>();
		
		Integer n = 30;
		t.set(n); // 타입 매개변수의 상속 관계는 성립 / 제너릭 타입은 Number 이므로 Integer로 값 넣어줘도 됨
		System.out.println(t.get());
		
		// Number a = t.get();
		// Integer a = t.get();	// 컴파일 오류
		// Integer a = (Integer)t.get();		
		
		// Number a = n;	// up casting
		
		Test1<Number> t2 = new Test1<>();
		Integer n2 = 50;
		t2.set(n2);
		System.out.println(t2.get());
		
		// Test1<Number> ob = t2;	// 컴파일 오류
			// 제너릭은 상속관계가 아님(업캐스팅 불가) == 제너릭 타입이 아버지 인거지 Test1가 아버지는 아님
	}
}

class Test1<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}