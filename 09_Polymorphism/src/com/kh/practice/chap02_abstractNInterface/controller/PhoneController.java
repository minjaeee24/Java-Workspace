package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {

	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] p = new Phone[2];
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		int count = 0;
		for(Phone phone : p) {
			if(phone instanceof V40) {
				result[count++] = ((V40) phone).printInformation();
			}else {
				result[count++] = ((GalaxyNote9)phone).printInformation();
			}
		}
		
//		for(int i = 0; i < p.length; i++) {
//			result[i] = p[i];
//			if(p[i] instanceof GalaxyNote9) {
//				((GalaxyNote9)p[i]).printInformation();
//			}else {
//				((V40)p[i]).printInformation();
//			}
//		}
		return result;
	}
}
