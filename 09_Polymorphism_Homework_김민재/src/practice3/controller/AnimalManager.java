package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {

		Animal[] ani = new Animal[5];
		ani[0] = new Dog("조봄", "초코푸들", 6);
		ani[1] = new Cat("윤준봉", "아메리카코숏", "부산", "얼룩이");
		ani[2] = new Dog("이북한", "푸들믹스", 5);
		ani[3] = new Cat("검코", "이쁜고양이", "부평", "얼룩이");
		ani[4] = new Dog("몽실이", "진돗개", 3);
		
		for(int i = 0; i < ani.length; i++) {
			ani[i].speak();
		}
	}

}
