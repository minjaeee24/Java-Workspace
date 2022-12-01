package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		try {
			if(!(0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100)) { // 예외처리는 여기서 하는게 좋음.
				throw new NumRangeException("1과 100 사이의 값이 아닙니다.");
			}
			System.out.printf("%d은(는) %d 의 배수인가 ? %s \n", num1, num2, new NumberController().checkDouble(num1, num2));
		}catch(NumRangeException e) {
			e.printStackTrace();
		}		
		
	}
}
