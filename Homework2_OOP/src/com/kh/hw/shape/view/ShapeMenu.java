package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
			if(menu == 3) {
				triangleMenu();
			}else if(menu == 4) {
				squareMenu();
			}else if(menu == 9) {
				System.out.print("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
				inputMenu();
			}
		
	}
	
	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		if(menu == 1) {
			inputSize(1, 1);
		}else if(menu == 2) {
			inputSize(1, 2);
		}else if(menu == 3) {
			printInformation(1);
		}else if(menu == 9) {
			return;
		}else {		
			triangleMenu();	
		}
	}
	
	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		
			switch(menu) {
			case 1: inputSize(2, 1); break;
			case 2:	inputSize(2, 2); break;
			case 3:	inputSize(2, 3); break;
			case 4: printInformation(2); break;
			case 9: return;
			}
			squareMenu();
		
	}
		
	/*	
		if(menu == 1) {
			inputSize(2, 1);
		}else if(menu == 2) {
			inputSize(2, 2);
		}else if(menu == 3) {
			inputSize(2, 3);
		}else if(menu == 4) {
			inputSize(2, 4);
		}else if(menu == 9) {
			inputMenu();
		}else {			
			squareMenu();
		}
	} */
	
	public void inputSize(int type, int menuNum) {
		double d = 0.0;
		if(type == 1) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				System.out.print("삼각형 면적 : ");
				d = tc.clacArea(height, width);
				
			}else if(menuNum == 2) {
				sc.nextLine();
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				tc.paintColor(color);
			}
			System.out.println(d);
		}else if(type == 2) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				System.out.println("사각형 둘레 : "+scr.calcPerimeter(height, width));
				
			}else if(menuNum == 2) {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				System.out.println("사각형 면적 : "+scr.clacArea(height, width));

			}else if(menuNum == 3) {
				sc.nextLine();
				System.out.println("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				scr.paintColor(color);
			}
		}	
			
	}
	
	public void printInformation(int type) {
		String result = "";
		if(type == 1) {
			result = tc.print();
			//System.out.println(tc.print());
		}else {
			result = scr.print();
			//System.out.println(scr.print());
		}
		System.out.println(result);
	}
	
}
