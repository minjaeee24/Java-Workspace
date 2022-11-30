package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		StringTokenizer x = new StringTokenizer(str, " ");

		// 방법 1. String클래스 이용
//		String s = "";
//		while(x.hasMoreTokens()) {
//			s += x.nextToken();
//		}
//		return s;
		
		// 방법 2. StringBuffer or StringBuilder를 이용.
		StringBuilder sb = new StringBuilder();
		while(x.hasMoreTokens()) {
			sb.append(x.nextToken());
		}		
		return sb.toString();
	}
	
	public String firstCap(String input) {
		String head = input.substring(0, 1).toUpperCase();
		String body = input.substring(1, input.length());
		String str = head.concat(body);
		return str;
		
		// return head + input.substring(1);
	}
	
	public int findChar(String input, char one) {
		int count = 0;

		// 방법 1. chatAt 활용
//		for(int i = 0; i < input.length(); i++) {
//			if(input.charAt(i) == one) {
//				count++;
//			}
//		}
		// 방법 2. toCharArray 활용
		char[] arr = input.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
//		for(char c : arr) {
//			if(c == one) {
//				count++;
//			}
//		}
		
		return count;
	}
	
	
}
