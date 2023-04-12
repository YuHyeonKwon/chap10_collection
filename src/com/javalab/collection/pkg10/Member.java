package com.javalab.collection.pkg10;

public class Member { // class s

	// 필드(멤버변수, 인스턴스변수)
	private String name;			// 이름
	private String joinDate;		// 가입일
	private	String lastVisiDate;	// 최종방문일
	private int numVisit;			// 방문횟수
	private char gender;			// 성별
	private String age;				// 연령대
	
	public Member() {
		super();
	}

	public Member(String name, String joinDate, String lastVisiDate, int numVisit, char gender, String age) {
		super();
		this.name = name;
		this.joinDate = joinDate;
		this.lastVisiDate = lastVisiDate;
		this.numVisit = numVisit;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getLastVisiDate() {
		return lastVisiDate;
	}

	public void setLastVisiDate(String lastVisiDate) {
		this.lastVisiDate = lastVisiDate;
	}

	public int getNumVisit() {
		return numVisit;
	}

	public void setNumVisit(int numVisit) {
		this.numVisit = numVisit;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", joinDate=" + joinDate + ", lastVisiDate=" + lastVisiDate + ", numVisit="
				+ numVisit + ", gender=" + gender + ", age=" + age + "]";
	}
	
} // class e
