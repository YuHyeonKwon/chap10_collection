package com.javalab.collection.pkg01;

import java.util.ArrayList;

public class ArrayList03 { // class s

	public static void main(String[] args) { // main s

		ArrayList<Person> people = new ArrayList<>();
		
		Person person1 = new Person("John", 25);
		Person person2 = new Person("Sarah", 30);
		Person person3 = new Person("Mike", 27);
		Person person4 = new Person("Jane", 18);
		// 추가 인원
		// "Mike", 27
		// "Jane", 18
		
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		
		// 향상된 for
		for (Person person : people) {
			System.out.println(person.getName() + " is " + person.getAge() + " years old.");
		}
		
		// 일반 for
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i).getName() + " " + people.get(i).getAge());
		}
		
	} // main e

} // class s
/**
 * Person 클래스
 * @return
 */
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
