package com.kh.practice.point.controller;

import com.kh.practice.point.medel.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		//r.setX(x);
		//r.setY(y);
		//r.setHeight(height);
		//r.setWidth(width);
		return "면적 : "+r.toString()+" / "+height * width;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		//r.setX(x);
		//r.setY(y);
		//r.setHeight(height);
		//r.setWidth(width);
		return "둘레 : "+r.toString()+" / "+ 2 * (width + height);
	}
	
	
}
