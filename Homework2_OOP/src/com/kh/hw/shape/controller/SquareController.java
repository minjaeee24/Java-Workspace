package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(2 , height, width);
		
		//s.setHeight(height);
		//s.setWidth(width);
		return height * 2 + width * 2;
	}
	
	public double clacArea(double height, double width) {
		s = new Shape(2 , height, width);

		
		s.setHeight(height);
		s.setWidth(width);
		return height * width;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
		System.out.println("색이 수정되었습니다.");
	}
	
	public String print() {
		return "사각형 " + s.information();
	}
	
	
}
