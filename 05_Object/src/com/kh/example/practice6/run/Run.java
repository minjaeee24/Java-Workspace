package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.*;

public class Run {

	public static void main(String[] args) {

		Book b = new Book();
		b.inform();
		
		Book b1 = new Book("책이름", "출판사", "저자");
		b1.inform();
		
		Book b2 = new Book("책이름1", "출판사1", "저자1", 15000, 0.1);
		b2.inform();
		
	}

}
