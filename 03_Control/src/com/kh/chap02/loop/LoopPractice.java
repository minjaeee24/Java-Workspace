package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		}
	}

	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice2();
		}
	}

	public void practice3(){

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		
		for(int i = 1; i < num; i++) {
			System.out.print(i + " + ");
		} 
		System.out.print(num + " = " + sum);
		
		
	}
	
	public void practice4() {
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			if(num1 < num2) {
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}else {
				for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
		}
	}
	
	public void practice5() {
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 10 && num > 0) {
			for(int i = num; i < 10; i++) {
				System.out.println("===== " + i + "단 =====");
				for(int j = 1; j < 10; j++){
					System.out.printf("%d X %d = %d \n", j, i, (j * i));
					}
				}
			}else {
				System.out.println("9 이하의 숫자를 입력해주세요");
				practice5();
			}
	}
	
	public void practice6() {
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i = 0; i < 10 ; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}
		
	}
	
	public void practice8() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				//if(i >= j) {
					System.out.print("*");
				//}else {
				//	System.out.print(" ");
				//}
			}System.out.println();
			
		}
		
	}
	public void practice9() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
			
		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				//if(i < j) {
					System.out.print("*");
				//}else {
				//	System.out.print(" ");
				//}
			}System.out.println();				
		}
			
	}
	
	public void practice10() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
			
		for(int i = 0; i < num; i++) {
			for(int j = num; j > 0; j--) {
				if(i < j-1) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();				
		}
		
		for(int i = 0; i<num; i++) {
			for(int j =1; j<num -i; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<2 +i; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
			
	}
	
	public void practice11() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//1
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(i <= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
			
		}
		
		//2
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i ; j++) {
				System.out.print(" ");
			}
			for(int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice12() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = num-1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i*2 ; k++) {
				System.out.print("*");
			}System.out.println();				
		}
	}
	
	public void practice13() { //어려워
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int num2 = 0;
		
		if(num > 1) {
			for(int i = 1; i <= num ; i++) {
				num2 = num/i;
			}
			if(num2==1&&num2==num2) {
				System.out.print("소수입니다.");
			}else {
				System.out.print("소수가 아닙니다.");
			}
		}else {
			System.out.print("잘 못 입력하셨습니다.");
		}
	}
	
	public void practice14() {
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("잘 못 입력하셨습니다.");
			return;
		}
		int count = 0;
		for(int i = 2; i <= num; i++) {
			boolean isPrime = true;
			//i값이 소수인지 아닌지 검사
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
				count++;
			}
			//i값이 소수라면 출력하고, 값을 1 증가
		}
		
		System.out.printf("\n2부터 %d까지의 소수의 개수는 %d개입니다.", num, count);
	}
	
	
	public void practice16() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = 0; i < num-1; i++) {
			for(int j = 0; j < num-1; j++) {
				if(i<=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void practice17() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(1 < i && i < num) {
					//for(int k = 0; k < num-2; k++) {
						System.out.print("@");
					//}
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	public void practice18() {
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num-(1 + i); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 1 + 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < num-1; i++) {
			for(int j = 0; j < 1+i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * (num - i) - 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
