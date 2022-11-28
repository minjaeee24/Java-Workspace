package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {

	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] p = new Phone[2];
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		for(int i = 0; i < p.length; i++) {
			result[i] = p[i].toString();
			if(p[i] instanceof GalaxyNote9) {
				((GalaxyNote9)p[i]).toString();
			}else {
				((V40)p[i]).toString();
			}
		}
		return result;
	}
}
