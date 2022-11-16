package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
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
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i] + " ");
		}
		
		
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
		// 1. 샤용자에게 양의 정수 입력받기
		int num =  sc.nextInt();
		// 2. 사용자에게 입력받은 정수만큼의 길이를 가진 배열을 생성
		int[] arr = new int[num];
		// 3. 1부터 size까지의 값을 배열에 초기화(대입)하기
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
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		// 2. 문자열의 문자를 하나하나 배열에다가 담기
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		int count = 0;
		String index = "";
		// 3. 검색할 문자가 문자열에 몇 개 있는지, 어느 인덱스에 있는지
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				// 갯수 증가
				index += i + " ";
				count++;
			}
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s \n", str, ch, index);
		System.out.printf("%c 개수 : %d", ch, count);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		// 1. 월, 화, 수, 목, 금, 토, 일 초기화된 문자열 배열 만들기
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 2. 사용자에게 숫자를 입력받기
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(days[num] + "요일");
		}else {
			System.out.println("잘 못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총 합 : " + sum);
	}
	
	public void practice8() {
		
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		if(size < 3 || size % 2 == 0) {
			System.out.println("다시 입력하세요.");
			practice8();
		}else {
			int[] arr = new int[size]; //5
			for(int index = 0; index <= size/2; index++) {
				// 0, 1, 2 -> 1, 2, 3
				arr[index] = 1+index;
			}
			int value = 1;
			for(int index = size/2+1; index < arr.length; index++) {
				// 3, 4 -> 2, 1
				arr[index] = size/2 + 1 - value;
				value++;
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
			}
		}
	}

	public void practice9() {
		
		String[] menu = {"양념", "후라이드", "고추바사삭", "레드콤보"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].equals(chicken)) {
				System.out.println(chicken + "치킨 배달 가능");
				return;
			}
		}
		System.out.println(chicken + "치킨은 없는 메뉴입니다.");
	}
}
