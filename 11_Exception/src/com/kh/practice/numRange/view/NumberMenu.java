package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	
	NumberController nc = new NumberController();
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		try {
			System.out.printf("%d은(는) %d 의 배수인가 ? ", num1, num2);
			System.out.println(nc.checkDouble(num1, num2));
		}catch(NumRangeException e) {
			e.printStackTrace();
		}		
		
	}
}
