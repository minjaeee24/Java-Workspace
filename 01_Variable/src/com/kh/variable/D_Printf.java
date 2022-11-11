package com.kh.variable;

public class D_Printf {

	/*
	 * System.out.println(출력하고자 하는 값); => 값을 출력하고 + 줄바꿈(개행)까지 넣어줌
	 * System.out.print(출력하조가 하는 값); => 값 출력만 해줌
	 * 
	 * System.out.printf("출력하고자 하는 형식", 출력하고자 하는 값, 출력하고자 하는 값, ...);
	 * => f는 format(형식)을 의미
	 * => 형식에 맞춰서 값들이 출력이 되고 끝(줄바꿈x)
	 * => 문자열 안에 그 값이 들어갈 자리에 다음과 같은 형식으로 잡아줘야한다.
	 * 
	 * 형식
	 * %d : 정수
	 * %f : 실수
	 * %c : 문자
	 * %s : 문자열
	 * 
	 */
	
	public void printFtest() {
		
		// 정수 테스트
		int iNum1 = 10;
		int iNum2 = 20;

		// iNum1 : xx, iNum2 : xx 를 출력해보기
		// 1. println을 사용해서 출력
		System.out.println("iNum1 : " + iNum1 +", iNum2 : " + iNum2);
		// 2. printF를 사용 -> 정수값의 형식 %d를 사용해서 완성
		//					 줄바꿈 기능이 없으므로 직점 개행문자를 추가해줄것.(\n)
		System.out.printf("iNum1 : %d, iNum2 : %d \n", iNum1, iNum2);

		// 10 + 20 = 30 을 출력해보기.
		// 1. println을 사용해서 출력
		System.out.println(iNum1 + " + " + iNum2 + " = "  + (iNum1 + iNum2));
		// 2. printf 사용
		System.out.printf("%d + %d = %d \n ", iNum1, iNum2, iNum1+iNum2);
		
		System.out.printf("%5d \n", iNum1); // %5d : 5칸의 공간 중 오른쪽 정렬
		System.out.printf("%-5d 진짜로? \n" , iNum1); // %-5d : 5칸의 공간 중 왼쪽 정렬(음수)
		
		// 실수 테스트
		double dNum = 4.27546789;
		System.out.printf("dNum : %f \n", dNum);
		// %f : 소수점 아래 7번째 줄에서 반올림되어 소수점 아래 6번째 까지만 출력됨.
		
		System.out.printf("dNum : %.1f \n", dNum); // dNum : 4.3
		// %.1f : 소수점 아래 2번째 줄에서 반올림되어 소수점 아래 1번째 까지만 출력됨.
		// .자릿수로 제어 가능.
		
		//printf : 포맷 한 번으로 간편하게 출력이 가능.
		// 단, 지정한 포맷의 갯수와 종류, 뒤에 오는 변수의 갯수와 종류가 정확하게 일치해야함.
		
		
		// 문자와 문자열 테스트
		char ch = 'a';
		String str = "Hello~";
		
		System.out.printf("%c %s \n", ch, str);
		System.out.printf("%C %S %% %n \n", ch, str); // %C , %S : 영어 알파벳일 경우
		// 대문자로 변환되어 출력
		
		
		
	}

	
}
