package com.javalab.collection.pkg07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentMain { // class s

	public static void main(String[] args) { // main s
		
		// ArrayList
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "John", 87));
		students.add(new Student(2, "Mary", 90));
		students.add(new Student(3, "Bob", 85));
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
//			System.out.println(students.get(i).getStudentId() + "\t" + students.get(i).getName() + "\t" + students.get(i).getScore());
		}
		System.out.println();
		
		// HashSet
		Set<Student> std = new HashSet<Student>();
		std.add(new Student(1, "John", 87));
		std.add(new Student(2, "Mary", 90));
		std.add(new Student(3, "Bob", 85));
		for (Student student : std) {
			System.out.println(student.toString());
		}
		System.out.println();
		Iterator<Student> iter = std.iterator();
		while(iter.hasNext()) {
			Student stu = iter.next();
			System.out.println("학번:"+stu.getStudentId() + "\t" + "이름:" + stu.getName() + "\t" + "점수:" + stu.getScore());
		}
		System.out.println();
		
		// Map
		Student stu1 = new Student(1, "John", 87);
		Student stu2 = new Student(2, "Mary", 90);
		Student stu3 = new Student(3, "Bob", 85);
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(stu1.getStudentId(), stu1);
		map.put(stu2.getStudentId(), stu2);
		map.put(stu3.getStudentId(), stu3);

		for(Integer key : map.keySet()) { 	 // key를 담고 있는 Set반환 [ 1, 2, 3 ]
			System.out.println(map.get(key).getStudentId() + "\t" + map.get(key).getName() + "\t" + map.get(key).getScore());
		}
		System.out.println();
		
		Set<Integer> keySet = map.keySet();					// 1. 키만 선별해서 Set<K> 반환
		Iterator<Integer> keyIterator = keySet.iterator();	// 2. 반복자 얻음
		while(keyIterator.hasNext()) {						// 3. while문 돌림
			Integer k = keyIterator.next();					// 4. Set에서 key를 하나씩 꺼낸다.
			Student m = map.get(k);
			System.out.println(k + ":" + m);
		}
	} // main e

} // class e
