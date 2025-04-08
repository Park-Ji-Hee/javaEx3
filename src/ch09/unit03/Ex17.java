package ch09.unit03;

public class Ex17 {

	public static void main(String[] args) {
		User17 u = new User17();
		
		try {
			u.set("김자바", -5);
			
			System.out.println(u.getName() + ":" + u.getAge());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end...");

	}
}

class User17 {
	private String name;
	private int age;
	

	public void set(String name, int age) throws Exception {
		try {
			setName(name);
			setAge(age);
		} catch (Exception e) {
			// System.out.println(e.toString());
			// System.out.println(e.getMessage());
			// e.printStackTrace();
			
			throw e;	// 예외 다시 던지기  / catch (Exception e) 여기로 던짐
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if(name.length() <2) {
			throw new Exception("이름은 두자 이상입니다.");
		}
		
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if( age <0 ) {
			throw new Exception("나이는 0이상만 가능합니다.");
		}
		this.age = age;
	}

}