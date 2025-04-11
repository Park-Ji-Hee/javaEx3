package ch12.unit02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "X", "B", "C", "X", "B", "A", "M", "B");
		
		System.out.println(list);
		
		// 중복 배제하여 새로운 리스트 담기
		List<String> list2 = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++) {
			if(list.indexOf(list.get(i)) == i) { 
				// i가 증가해도 indexOf값은 앞에 중복된 값의 인덱스 위치를 알려주기 때문에 주소값이 다르게 됨
				list2.add(list.get(i));
			}
		}
		System.out.println(list2);
	}

}
