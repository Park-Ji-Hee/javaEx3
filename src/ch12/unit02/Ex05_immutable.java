package ch12.unit02;

import java.util.List;

// immutable(불변) : 값이 절대로 변경되면 안되는 
public class Ex05_immutable {

	public static void main(String[] args) {
		// 불변 Collection(JDK 9)
		List<String> list = List.of("A", "B", "D");
		System.out.println(list);
		
		// list.add("C");	// 런타임오류 / ****왜?
		// list.set(2,"C");	// 런타임오류 / ****왜?
		
	}

}
