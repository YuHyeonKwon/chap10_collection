package com.javalab.collection.pkg06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample { // class s

	public static void main(String[] args) { // main s

		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();	// Map: key:value 형태로 들어간다.	key는 중복되면 안된다.
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);		// 마지막에 들어간 홍길동이 출력
		System.out.println("총 Entry 수: " + map.size());
		
		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);	// 홍길동의 점수
		System.out.println(key + ": " + value);
		System.out.println();
		
		// 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();	// 모든 키를 Set 컬렉션에 담아서 반환
		// keySet.iterator() 반복자 리턴
		Iterator<String> keyIterator = keySet.iterator();
		System.out.println("keyIterator.getClass().getSimpleName():" + key);
		System.out.println();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();	// k의 type은 String(이름)
			Integer v = map.get(k);		// 점수
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		// 키로 엔트리 삭제
//		map.remove("홍길동");
		Integer score = map.remove("홍길동");		// 삭제된 키와 매핑되는 값을 반환
		System.out.println("score: " + score);	// 매핑됐던 값 출력
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
	} // main e

} // class e
