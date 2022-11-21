package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.*;

public class Run {

	public static void main(String[] args) {

		Student s = new Student();
		s.setGrade(1);
		s.setClassroom(1);
		s.setName("김민재");
		s.setHeight(180.0);
		s.setGender('남');
		s.information();
	}

}
