package com.kh.example.practice6.model.vo;

public class Book {

	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		
	}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title,String publisher, String author, int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.printf("책 제목 : %s, 출판사 : %s, 저자 : %s, 가격 : %d, 할인율 : %.1f\n", title, publisher, author, price, discountRate);
	}
}
