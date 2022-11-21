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
		name = null;
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
	public void information() {
		// xxx학생은 x학년 x반이고, 키는 xxx.xcm이며 남(여)학생입니다.
		System.out.printf("%s학생은 %d학년 %d반이고, 키는 %.1fcm이며 %c학생입니다.", name, grade, classroom, height, gender);
	}
	
}
