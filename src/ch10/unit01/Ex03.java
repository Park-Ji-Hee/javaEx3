package ch10.unit01;

public class Ex03 {

	public static void main(String[] args) {
		// 시스템 환경 설정 확인
		String s;
		
		s = System.getProperty("os.name"); // ""안에 들어가는말 정해져 있음
		System.out.println("운영체제 : " + s); // 운영체제 : Windows 11  

		s = System.getProperty("file.encoding");	 
		System.out.println("character set : " + s);  // character set : UTF-8 
		
		s = System.getProperty("java.version");	 // 자바버전 : 23.0.2
		System.out.println("자바버전 : " + s);
		
		s = System.getProperty("user.dir");	 
		System.out.println("현재작업경로 : " + s); // 현재작업경로 : C:\study\work\javaEx3
	}

}
