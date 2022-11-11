package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int a = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int b = sc.nextInt();
		
		int c = b / a;
		int d = b % a;
		
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + c);
		System.out.println("남는 사탕 개수 : " + d);

	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String str = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int a = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int b = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int c = sc.nextInt();

		/* System.out.print("성별(M/F) : ");
		String ch = sc.nextLine();
		String result = (ch == "M") ? "여학생" : "남학생";
		String ch1 = sc.nextLine(); */
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double e = sc.nextDouble();
		
		System.out.println();
		//System.out.println(a + "학년 " + b + "반 " + c + "번 " + str + " " + result + "의 성적은 " + e + "이다.");
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", a,b,c,str,(gender == 'M' ? "남학생" : "여학생"), e);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age > 19) ? "성인" : age > 13 ? "청소년" : "어린이";

		System.out.println();
		System.out.println(result);
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();	
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
		double d = (a+b+c)/3;
		String result = (a >= 40 && b >= 40 && c >= 40) && d/3 >=60 ? "합격" : "불합격";
		
		System.out.println();
		System.out.println("합계 : " + (a + b + c));
		System.out.println("평균 : " + d);
		System.out.println(result);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String a = sc.nextLine();
		char b = a.charAt(7);
		String result = (b == '1' || b =='3') ? "남자" : "여자";
		
		System.out.println(result);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("정수3 : ");
		int num3 = sc.nextInt();
	
		boolean result = (num3 <= num1) || (num3 > num2) ? true : false;
		System.out.println(result);
	
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 && num1 == num3) ? true : false;
		System.out.println(result);
	
	}

	public void practice8() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();

		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
	
		double num1total = num1 * 1.4;
		double num2total = num2;
		double num3total = num3 * 1.15;
		
		System.out.println("A사원의 연봉/연봉+a : " + num1 + "/" + num1total);
		System.out.println(num1total >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("B사원의 연봉/연봉+a : " + num2 + "/" + num2total);
		System.out.println(num2total >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("C사원의 연봉/연봉+a : " + num3 + "/" + num3total);
		System.out.println(num3total >= 3000 ? "3000 이상" : "3000 미만");
		
	}
	
	
	
	
	
	
	
	
	
	
}
