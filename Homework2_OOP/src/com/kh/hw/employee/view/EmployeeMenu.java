package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	
	Scanner sc = new Scanner(System.in);
	EmployeeController ec = new EmployeeController();
	
	// 멤버 필드
	public EmployeeMenu() {
		// 메뉴 안내가 되고 메뉴 번호에 따라 같은 클래스에 있는 메소드 실행 
		// 번호를 잘못 입력했으면 잘못 입력했다는 안내가 뜸
	}
	public void insertEmp(){
		// 사원 번호, 사원 이름, 사원 성별, 전화 번호는 기본적으로 받고
		// 추가적인 정보를 더 입력할 것인지 물어본 후
		// 입력하겠다고 하면 사원부서, 사원 연봉, 보너스 율을 추가로 더 받고
		// 모든 데이터를 EmployeeController의 add메소드 인자로 보냄
		// 추가정보를 입력하지 않겠다고 하면 기본정보만 add메소드 인자로 보냄
	}
	public void updateEmp(){
		// 사원 정보 수정에 대한 메뉴 안내가 출력되고
		// 사용자가 수정하고 싶은 내용에 대한 번호를 입력
		// 입력한 메뉴에 맞는 해당 데이터를 EmployeeController에서 수정
		
	}
	public void deleteEmp(){
		// 정말 삭제할 것인지 물어본 후 삭제하겠다고 하면
		// EmployeeController의 remove()메소드를 호출하여 반환 값에 따라 // 데이터 삭제에 실패하였는지 성공하였는지 출력
	}
	public void printEmp(){
		// 사원정보가 있다면 사원정보 출력, 없다면 “사원 데이터가 없습니다”출력
	}
}
