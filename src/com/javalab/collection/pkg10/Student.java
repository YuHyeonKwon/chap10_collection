package com.javalab.collection.pkg10;

public class Student { // class s

	private String studentId;
	private String jumin;
	private String name;
	private Integer year;
	private String juso;
	private Integer department;
	
	public Student() {
		super();
	}

	public Student(String studentId, String jumin, String name, Integer year, String juso, Integer department) {
		super();
		this.studentId = studentId;
		this.jumin = jumin;
		this.name = name;
		this.year = year;
		this.juso = juso;
		this.department = department;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getJuso() {
		return juso;
	}

	public void setJuso(String juso) {
		this.juso = juso;
	}

	public Integer getDepartment() {
		return department;
	}

	public void setDepartment(Integer department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", jumin=" + jumin + ", name=" + name + ", year=" + year + ", juso="
				+ juso + ", department=" + department + "]";
	}
	
} // class e
