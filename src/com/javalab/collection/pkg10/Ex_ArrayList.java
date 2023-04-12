package com.javalab.collection.pkg10;

import java.util.List;
import java.util.ArrayList;

public class Ex_ArrayList { // class s

	public static void main(String[] args) { // main s

		// [문제.1] 1,2,3,4,5,6,7,8,9,10 을 갖는 ArrayList를 생성하고 값을 출력하세요.
		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		list.add(8);
//		list.add(9);
//		list.add(10);
		for(int i = 1; i <= 10; i ++) {
			list.add(i);
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		
		System.out.println("\n");
//		/ [문제.2] 다음 값을 갖는 ArrayList를 생성하고 값을 출력하세요.
		List<String> list1 = new ArrayList<>();
		list1.add("Volvo");
		list1.add("Benz");
		list1.add("BMW");
		list1.add("Hyundai");
		for (String string : list1) {
			System.out.println(string);
		}
		System.out.println();
		// [문제.3] 다음 raw data를 담을 수 있는 Student 클래스를 설계하고
		// 객체를 생성하여 ArrayList에 담고 출력하세요.
		List<Student> list2 = new ArrayList<>();
		list2.add(new Student("1234", "123456-1234567", "홍길동", 3, "천안", 210));
		list2.add(new Student("5678", "987456-2334567", "김길동", 4, "대전", 220));
		list2.add(new Student("8970", "357556-2334789", "이길동", 1, "서울", 230));
		
		
//		Student student1 = new Student("1234", "123456-1234567", "홍길동", 3, "천안", 210);
//		Student student2 = new Student("5678", "987456-2334567", "김길동", 4, "대전", 220);
//		Student student3 = new Student("8970", "357556-2334789", "이길동", 1, "서울", 230);
//
//		list2.add(student1);
//		list2.add(student2);
//		list2.add(student3);
		for (Student student : list2) {
			System.out.println(student.getStudentId() + "\t" + student.getJumin() + "\t" + student.getName() + "\t"
					+ student.getYear() + "\t" + student.getJuso() + "\t" + student.getDepartment());
		}

	} // main e
} // class e
