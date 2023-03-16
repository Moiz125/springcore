package com.springcore;

import java.util.List;

public class Student {
	private int studentId;
	private String name;
	private String studentAddress;
	private List<String> subject;
	private Dept dept;
	
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, String studentAddress, List<String> subject, Dept dept) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.studentAddress = studentAddress;
		this.subject = subject;
		this.dept = dept;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", studentAddress=" + studentAddress
				+ ", subject=" + subject + ", dept=" + dept + "]";
	}


}
