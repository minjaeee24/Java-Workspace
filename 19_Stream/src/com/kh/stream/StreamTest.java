package com.kh.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	/*
	 *  Stream?
	 *  스트림은 배열 및 컬렉션에 저장된 요소에 하나씩 접근하여 해당값을 "람다식"으로 처리하는 반복자
	 * 
	 *  컬렉션이 요소를 할당하고 관리하는데 목적이 있다면
	 *  스트림은 요소를 검색, 필터링하거나 값을 처리하는데 목적이 있음
	 * 
	 *  스트림의 특징
	 *  1) 메소드의 매개변수에 람다식 사용가능
	 *  2) 식이 간결해짐
	 *  3) 컬렉션 및 배열을 통한 연산결과를 얻어오기 용이함.
	 * 
	 */
	public static void main(String[] args) {
		
		// 스트림 사용 방법
		
		// 배열에서의 stream 사용방법
		String[] foods = {"삼겹살", "갈비살", "쌈장", "파"};
		
		// 1) stream()메소드를 통한 스트림객체 선언
		Stream<String> strStream = Arrays.stream(foods);
		
		// 2) forEach반복문을 통해 배열 요소에 하나씩 접근
		strStream.forEach(str -> {System.out.println(str);});
		
		// int형 배열을 선언하여 연산테스트
		int[] iArr = {1, 3, 5, 7, 9};
		
		IntStream iStream = Arrays.stream(iArr);
		
		// forEach반복문을 통해 배열 요소에 하나씩 접근해서 그 안에 담긴 값을 모두 더하고 싶음
		int sum = 0;
		String test = "지역변수";
		final String test2 = "이것도 지역변수";
		
		iStream.forEach(num -> {
			//sum += num;
			System.out.println(test);
			System.out.println(test2);
		});
		/*
		 * 람다식에서 지역변수를 사용하려면 그 값이 final(상수)이거나 사실상 값이 할당된 후 바뀌지 않아서 final(상수)처럼 사용되는
		 * 경우에만 사용 가능하다.
		 * 
		 * 람다캠쳐링 즉 지역변수의 값이 람다식 내부에서 바뀌면 안 됨.
		 * 
		 */
		
		// 컬렉션에서 stream 사용방법
		ArrayList<Product> pList = new ArrayList();
		pList.add(new Product("갤럭시 z플립4", 1_350_000, 10, "삼성"));
		pList.add(new Product("갤럭시 z플립3", 1_000_000, 3, "삼성"));
		pList.add(new Product("아이폰 14", 1_450_000, 2, "애플"));
		pList.add(new Product("아이폰 13", 1_050_000, 15, "애플"));
		
		// 1) stream()메소드를 통해 스트림객체 선언
		Stream<Product> proStream = pList.stream();
		
		// 2) forEach메소드로 각 요소에 접근
		proStream.forEach(product -> System.out.println(product));
		
		
		
		
		
		
	}

}
