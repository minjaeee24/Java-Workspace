package com.kh.example.practice3.model.vo;

public class Circle {

	// 필드부
	private static final double PI = 3.14;
	private int radius = 1;
	
	// 생성자부
	public Circle() {
		
	}
	
	// 메소드부
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void incrementRadius() {
		radius++;
		getAreaOfCircle();
		getSizeOfCircle();
		
	}
	
	// 원의 둘레 2*pi*r
	public void getAreaOfCircle() {
		System.out.println(2 * PI * radius);
	}
	
	// 원의 넓이 pi*r^2
	public void getSizeOfCircle() {
		System.out.println(PI * radius * radius);
	}
	
	
	
	
	
	
	
	
	
}
