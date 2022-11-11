package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = "";
		switch(num) {
		case 1 : result = "입력";break;
		case 2 : result = "수정";break;
		case 3 : result = "조회";break;
		case 4 : result = "삭제";break;
		case 7 : result = "종료";break;
		}
		if(result.equals("종료")) {
			System.out.println("프로그램이 종료됩니다");
		} else {
			System.out.println(result + "메뉴입니다.");
		}
	}
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
			System.out.println("짝수다");
			
		} else /*if(num % 1 == 0)*/ {
			System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int a = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int b = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int c = sc.nextInt();
		
		int sum = a + b + c;
		double avg = sum / 3.0;
		
		if(a >= 40 && b >= 40 && c >= 40 && avg >= 60) {
			System.out.println("국어 : " + a);
			System.out.println("수학 : " + b);
			System.out.println("영어 : " + c);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 2 :
		case 12 : System.out.println(month + "월은 겨울입니다.");break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println(month + "월은 봄입니다.");break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println(month + "월은 여름입니다.");break;
		case 9 : 
		case 10 :
		case 11 : System.out.println(month + "월은 가을입니다.");break;
		default : System.out.println(month + "월은 잘 못 입력된 달입니다.");
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		// 1. 아이디값을 잘 입력했는지 체크를 할 것.
		// 2. 아이디값이 잘 입력되었다면, 비밀번호를 잘 입력했는지 체크를 할 것.
		if(id.equals("minmin")) { // 아이디값을 잘 입력했는지 체크
			if(pw.equals("Min1234")) { // 비밀번호를 잘 입력했는지 체크
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String gd = sc.nextLine();
		
		switch(gd) {
		case "관리자" : System.out.print("회원관리, 게시글 관리, ");
		case "회원" : System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원" : System.out.print("게시글 조회");
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m);
		String result = "";
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도비만");
		}
		System.out.println(result);
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자 1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자 2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,&) : ");
		char op = sc.nextLine().charAt(0);
		
		switch(op) {
		case '+' : System.out.printf("%d %c %d = %d", num1, op, num2, (num1+num2));break;
		case '-' : System.out.printf("%d %c %d = %d", num1, op, num2, (num1-num2));break;
		case '*' : System.out.printf("%d %c %d = %d", num1, op, num2, (num1*num2));break;
		case '/' : System.out.printf("%d %c %d = %f", num1, op, num2, (num1/(double)num2));break;
		case '%' : System.out.printf("%d %c %d = %d", num1, op, num2, (num1%num2));break;
		default  : System.out.println("잘 못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}

	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pwd = sc.nextInt();
		
		if(pwd > 999 && pwd < 9999) { // 자릿수 체크
			int first = pwd % 10; // 일의 자릿수 구하기
			int second = (pwd / 10) % 10;
			int third = (pwd / 100) % 10;
			int forth = (pwd / 1000) % 10;
			// 중복값이 있는지 처리하기
			if(first != second && first != third && first != forth && second != third &&
					second != forth && third != forth) {
			System.out.println("생성 성공");	
			}else {
				System.out.println("중복 값 있음");
			}
				
		}else { // 자릿수가 3자리 이하거나, 5자리 이상인 경우
			// 자릿수 안 맞음 출력
			System.out.println("자릿수 안 맞음");
		}
		
		
	}
	
}