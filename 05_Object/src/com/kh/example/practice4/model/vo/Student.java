package com.kh.example.practice4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	// 초기화 블럭
	{
		grade = 0;
		classroom = 0;
		name = "";
		height = 0.0;
		gender = 0;
		
	}
	
	// 기본생성자
	public Student() {
		
	}
	
	// set메소드
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// get메소드
	public int getGrade() {
		return grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	// 인포메이션
	public String information() {
		return grade+"학년 "+classroom+"반 "+name+"님의 키는 "+height+"cm이고 성별은 "+gender+"입니다.";
	}
	
	
	
	
	
	
	
	
	
}
