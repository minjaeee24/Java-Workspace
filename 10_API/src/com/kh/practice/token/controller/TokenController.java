package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		String full = str;
		String s = "";
		StringTokenizer x = new StringTokenizer(full, " ");
		while(x.hasMoreTokens()) {
			s += x.nextToken();
		}
		return s;
	}
	
	public String firstCap(String input) {
		String head = input.substring(0, 1).toUpperCase();
		String body = input.substring(1, input.length());
		String str = head.concat(body);
		return str;
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		char[] arr = input.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
		return count;
	}
	
	
}
