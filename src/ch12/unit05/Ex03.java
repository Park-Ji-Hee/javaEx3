package ch12.unit05;

import java.util.Map;

public class Ex03 {

	public static void main(String[] args) {
		// 불변 Collection : JDK 9
		
		Map<String, Integer> map = Map.of("a", 100);
		System.out.println(map);
		// map.put("b", 200); // 런타임 오류 / Map.of데이터 불변의 컬렉션을 사용하였기 때문에 값을 못 바꿈
		
		Map<String, Integer> map2 = Map.of("a", 100, "b", 200);
		System.out.println(map2);
		
		Map<String, Integer> map3 = Map.ofEntries(Map.entry("a", 100), Map.entry("b", 200)); // map.entrySet : 키-값을 하나의 쌍으로 만들어줌
		System.out.println(map3);
	
	}

}
