package ch12.unit02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("부산");
		list1.add("대구");

		List<String> list2 = new ArrayList<String>();
		list2.add("강원");
		list2.add("경기");
		list2.add("제주");
		
		// list2에  list1의 모든 데이터 추가
		list2.addAll(list1);
		System.out.println(list2);
		
		// List<String> => String[]
		// String[] ss = list2.toArray(new String[0]); // 0은 배열의 크기를 자동으로 지정
		String[] ss = list2.toArray(new String[list2.size()]); // 위에 코드와 의미 동일
		System.out.println(Arrays.toString(ss));	// toString : 배열을 문자열로 바꿔줌
		
		// String[] => List<String>
		List<String> list3 = Arrays.asList(ss); // Arrays.asList(ss); : 배열을 List로 바꿔줌
		System.out.println(list3);
		System.out.println(list2.getClass().getName());
			// ArrayList
		System.out.println(list3.getClass().getName());
			// Arrays$ArrayList / $ : 내부클래스 // Arrays안에 있는 ArrayList배열
		System.out.println();
		
		
		// subList(a, b) : a 인덱스에서 b-1까지의 부분 List // 중간것만 끄집어 내서 배열만들기
		List<String> list4 = list2.subList(1, 4);
		System.out.println(list4); 	// [경기, 제주, 서울]
		
		
		
		// 전체삭제
		list1.clear();
		System.out.println("전체삭제후 : " + list1.size());
		
		// 부분삭제
		System.out.println("삭제전 : " + list2);
		list2.subList(2, 5).clear();	// [제주, 서울, 부산] 삭제
		System.out.println("부분삭제 후 : " + list2);
	}

}
