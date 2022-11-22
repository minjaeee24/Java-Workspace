package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {

	private Shape s = new Shape();
	
	public double clacArea(double height, double width) {
		s = new Shape(1 , height, width);
		
		//s.setHeight(height);
		//s.setWidth(width);
		return height * width / 2;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
		System.out.println("색이 수정되었습니다.");
	}
	
	public String print() {
		return "삼각형 " + s.information();
	}
	
}
