package ch011.unit02;

//않좋은 코드 예시
public class Ex02 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.set("서울");
		String s = (String)t.get(); // 캐스팅(형변환) 필요, 캐스팅 안하면 길이 못구함
		System.out.println(s + ":" + s.length());
		
		Test2 t2 = new Test2();
		t2.set(30);
		Integer i = (Integer)t2.get();
		System.out.println(i + 10);
		
		/* // 런타임 오류
		t2.set("자바");
		i = (Integer)t2.get();
		System.out.println(i + 10);
		*/
	}

}

class Test2 {
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
}