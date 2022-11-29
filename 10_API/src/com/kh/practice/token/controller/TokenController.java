package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		String a = str;
		String c = "";
		StringTokenizer b = new StringTokenizer(a, " ");
		while(b.hasMoreTokens()) {
			c += b.nextToken();
		}
		return c;
	}
	
	public String firstCap(String input) {
		String a = input.substring(0, 1).toUpperCase();
		String b = input.substring(1, input.length());
		String c = a.concat(b);
		return c;
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
