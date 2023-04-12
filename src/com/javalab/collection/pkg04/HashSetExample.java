package com.javalab.collection.pkg04;

import java.util.*;


public class HashSetExample { // class s

	public static void main(String[] args) { // main s

		// HashSet 객체 생성
		Set<Member> members = new HashSet<>();
		
		members.add(new Member("Alice", 30));
		members.add(new Member("Bob", 35));
		members.add(new Member("Charlie", 48));
		members.add(new Member("Alice", 45));
		
		// HashSet 객체 생성
		Set<Member> members2 = new HashSet<>();
		
		members2.add(new Member("Alice", 29));
		members2.add(new Member("Bob", 35));
		members2.add(new Member("Charlie", 48));
		members2.add(new Member("Alice", 45));
		
		// 위의 두 HashSet의 내용 비교
		if(members.equals(members2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	} // main e

} // class e
