package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	
	Employee e = new Employee();
		// 멤버 필드
	public void add(int empNo, String name, char gender, String phone) {
		// 받아온 매개변수만큼 매개변수 있는 생성자를 통해 값 저장
	}
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		
	}
	public void modify(String phone){
		// 받아온 매개변수를 이용하여 해당 정보 수정
	}
	public void modify(int salary) {
		
	}
	public void modify(double bonus) {
		
	}
	public Employee remove(){
		// 객체 e에 null을 저장하여 객체 삭제
		return "";
	}
	public String inform(){
		// 객체 e가 null이라면 null 반환, 아니라면 사원 정보 반환
		return "";
	}
}
