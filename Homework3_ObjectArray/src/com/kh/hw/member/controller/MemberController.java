package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMember() {
		int count = 0;
		for(Member mem : m) {
			if(mem != null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		for(Member mem : m) {
			if(mem != null && mem.getId().equals(inputId)) {
				return false;
			}
		}
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i = 0; i <SIZE; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;				
			}
		}
	}
	
	public String searchId(String id) {
		for(Member mem : m) {
			if(mem != null && mem.getId().equals(id)) {
				return mem.inform();
			}
		}
		return "";
	}
	
	public Member[] searchName(String name) {
		Member[] arr = new Member[SIZE];
		int index = 0;
		for(Member mem : m) {
			if(mem != null && mem.getName().equals(name)) {
					arr[index++] = mem;
				}
		}
		return arr;
	}
	
	public Member[] searchEmail(String email) {
		Member[] arr = new Member[SIZE];
		int index = 0;
		for(Member mem : m) {
			if(mem != null && mem.getEmail().equals(email)) {
					arr[index++] = mem;
				}
		}
		return arr;
	}
	
	public boolean updatePassword(String id, String password) {
		boolean result = false;
		for(Member mem : m) {
				if(mem != null && mem.getId().equals(id)) {
					mem.setPassword(password);
					result = true;
				}
		}
		return result;
	}
	
	public boolean updateName(String id, String name) {
		boolean result = false;
		for(Member mem : m) {
				if(mem != null && mem.getId().equals(id)) {
					mem.setName(name);
					result = true;
				}
		}
		return result;
	}
	
	public boolean updateEmail(String id, String email) {
		boolean result = false;
		for(Member mem : m) {
				if(mem != null && mem.getId().equals(id)) {
					mem.setEmail(email);
					result = true;
				}
		}
		return result;
	}
	
	public boolean delete(String id) {
		boolean result = false;
		for(int i = 0; i < SIZE; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;	
				result = true;
				break;
			}
		}
		return result;
	}
	
	public void delete() {
		m = new Member[SIZE];
	}
	
	public Member[] printAll() {
		return m;
	}
	
	
	
}
