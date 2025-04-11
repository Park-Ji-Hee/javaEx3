package ch12.unit04;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Quize02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		
		try {
			System.out.print("구매 개수 ? ");
			count = sc.nextInt();
			
			for(int i = 1; i <= count; i++) {
				Set<Integer> set = Lotto();
				System.out.printf("%2d 게임: ", i);
				print(set);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}
	
	public static Set<Integer> Lotto() {
		Set<Integer> set = new TreeSet<Integer>();
		
		/* 방법1
		Random rnd = new Random();
		int n;
		
		while(set.size() < 6) {
			n = rnd.nextInt(45)+1;
			set.add(n);
		}
		*/
		
		/* 방법2
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45 +1));
		}
		*/
		
		return set;
	}
	
	public static void print(final Set<Integer> set) { // final 안써도 됨
		for(Integer n : set) {
			System.out.printf("%4d", n);
		}
		System.out.println();
	}
}
