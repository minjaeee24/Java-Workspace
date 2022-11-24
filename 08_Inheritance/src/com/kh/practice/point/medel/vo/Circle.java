package com.kh.practice.point.medel.vo;

public class Circle extends Point {

	private int radius;
	
	public Circle() {
		
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRedius() {
		return radius;
	}

	public void setRedius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+radius;
	}
	
}
