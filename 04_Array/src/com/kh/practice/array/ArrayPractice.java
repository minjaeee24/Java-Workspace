package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		//ex.
		//1 2 3 4 5 6 7 8 9 10
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
	}
	public void practice2() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		//ex.
		//10 9 8 7 6 5 4 3 2 1
		
		int[] arr = new int[10];
		for(int i = arr.length-1; i >= 0; i--) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
	}
	public void practice3() {
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		//ex.
		//양의 정수 : 5 12345
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num =  sc.nextInt();
		int[] arr = new int[num];
		
		System.out.print("양의 정수 : " + num + " ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]);
		}
		
	}
	
	public void practice4() {
		//길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후 배열 인덱스를 활용해서 귤을 출력하세요.
		//ex. 귤
		
		String[] arr = new String[5];
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		System.out.println(arr[1]);
		
	}
	
	public void practice5() {
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 
		//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		//ex.
		//문자열 : application
		//문자 : i
		//application에 i가 존재하는 위치(인덱스) : 4 8 i 개수 : 2
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print("문자열을 입력하세요 : ");
			
	
		}
	}
}
