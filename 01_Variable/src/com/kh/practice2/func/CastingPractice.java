package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {

	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double a = sc.nextDouble();
		
		System.out.print("영어 : ");
		double b = sc.nextDouble();
		
		System.out.print("수학 : ");
		double c = sc.nextDouble();
		
		int sum = (int)(a+b+c);
		int avg = sum/3;
		
		//System.out.println("총점 : " + sum);
		System.out.printf("총점 : %d \n", sum);
		//System.out.println("평균 : " + avg);
		System.out.printf("평균 : %d \n", avg);
	}
	
}
