package com.kh.chap04;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.kh.model.vo.Product;

public class OperatorAndPredicate {
	/*
	 * Operator인터페이스의 특징
	 * 1. 단순연산시 사용
	 * 2. 매개변수로 받아온 타입, 혹은 인자를 통해 계산을 하고 해당 타입 그대로 반환
	 * 
	 * Predicate인터페이스의 특징
	 * 1. 매개변수로 넘어온 값을 "검증"할때 사용
	 * 2. 받아온 타입을 확인하고 boolean값을 반
	 * 
	 */
	public static void main(String[] args) {
		
		// Predicate<T> : T형을 인자로 받아서 true or false값을 리턴
		// Product클래스를 인자로 받아서 재고가 있다면 true, 없으면 false반환.
		
		Predicate<Product> checkStock = product -> product.getStock() > 0;
		
		ArrayList<Product> pList = new ArrayList<>();
		pList.add(new Product("갤럭시 z플립 4", 1_350_000, 55));
		pList.add(new Product("갤럭시 z플립 3", 1_100_000, 80));
		pList.add(new Product("갤럭시 z폴드 4", 1_250_000, 65));
		pList.add(new Product("갤럭시 z폴드 3", 1_000_000, 0));
		pList.add(new Product("아이폰 14", 1_550_000, 0));
		pList.add(new Product("아이폰 13", 1_450_000, 30));
		
		for(Product p : pList) {
			if(checkStock.test(p)) { // 재고가 0개보다 많다
				System.out.println(p.getpName() + "상품은 현재 재고가 있습니다.");
			}else { // 재고가 0개이거나 더 적다
				System.out.println(p.getpName() + "상품은 현재 재고가 없습니다.");
			}
		}
		
		
		
	}

}
