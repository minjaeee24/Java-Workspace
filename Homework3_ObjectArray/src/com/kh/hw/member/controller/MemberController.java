package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMember() {
		int count = 0;
		for(Member a : m) {
			if(a != null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		boolean ch = false;
		for(Member a : m) {
			if(a.equals(inputId)) {
				ch = false;
			}else {
				ch = true;
			}
		}
		return ch;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i = 0; i < m.length; i++) {
			m[i] = new Member(id, name, password, email, gender, age);
		}
	}
	
	public String searchId(String id) {
		String result = null;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				if(m[i].getId().equals(id)) {
					result = m[i].inform();
				}
			}
		}
		return result;
	}
	
	public Member[] searchName(String name) {
		int index = 0;
		Member[] arr = new Member[SIZE];
		for(Member mem : m) {
			if(mem != null) {
				if(mem.getName().equals(name)) {
					arr[index] = m[index];
				}
			}	index++;
		}
		return arr;
	}
	
	public Member[] searchEmail(String email) {
		int index = 0;
		Member[] arr = new Member[SIZE];
		for(Member mem : m) {
			if(mem != null) {
				if(mem.getEmail().equals(email)) {
					arr[index] = m[index];
				}
			}	index++;
		}
		return arr;
	}
	
	public boolean updatePassword(String id, String password) {
		int index = 0;
		for(Member mem : m) {
			if(mem != null) {
				if(mem.getId().equals(id)) {
					m[index].setPassword(password);
					return true;
				}
			}	index++;
		}
		return false;
	}
	
	public boolean updateName(String id, String name) {
		int index = 0;
		for(Member mem : m) {
			if(mem != null) {
				if(mem.getId().equals(id)) {
					m[index].setName(name);
					return true;
				}
			}	index++;
		}
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		int index = 0;
		for(Member mem : m) {
			if(mem != null) {
				if(mem.getId().equals(id)) {
					m[index].setEmail(email);
					return true;
				}
			}	index++;
		}
		return false;
	}
	
	public boolean delete(String id) {
		int index = 0;
		for(Member mem : m) {
			if(mem != null) {
				if(mem.getId().equals(id)) {
					
				}
			}
		}
	}
	
	public void delete() {
		for(Member mem : m) {
			if(mem != null) {
				mem.setId(null);
				mem.setName(null);
				mem.setPassword(null);
				mem.setEmail(null);
				mem.setGender('0');
				mem.setAge(0);
			}
		}
		System.out.println("성공적으로 삭제하였습니다.");
	}
	
	public Member[] printAll() {
		return m;
	}
	
	
	
}
