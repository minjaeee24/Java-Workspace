package com.kh.chap02;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import com.kh.model.vo.Product;

public class SupplierTest {
	/*
	 * Supplier인터페이스의 특징
	 * 1. 주로 생산자역할을 띈 함수를 작성할때 사용.
	 * 2. 매개변수x 리턴값은 있다.
	 * 3. 내부적으로 getXXX() 메소드 존재
	 * 
	 */
	// 1) Supplier<T> : T형을 반환
	static Supplier<Product> supplier = () -> {return new Product("아이폰 14", 1_400_000, 100);};
	
	// 2) xxxSuplier : xxx형 반환
	static BooleanSupplier isTrue = () -> false;
	
	public static void main(String[] args) {
		System.out.println(supplier.get());
		
		System.out.println("z플립 사고 싶습니까?" + isTrue.getAsBoolean());
		
	}
	
}
