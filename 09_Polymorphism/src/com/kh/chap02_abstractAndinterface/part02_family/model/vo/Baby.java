package com.kh.chap02_abstractAndinterface.part02_family.model.vo;

public class Baby extends Person implements Basic {

	public Baby() {
		
	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public String toString() {
		return "Baby [toString()=" + super.toString() + "]";
	}
	
	// eat -> 몸무게 3 증가, 건강도 1 증가
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
	}
	
	// sleep -> 건강도 3 증가
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 3);
	}
}
