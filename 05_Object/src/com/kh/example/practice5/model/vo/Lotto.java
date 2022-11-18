package com.kh.example.practice5.model.vo;

public class Lotto {

	private int[] lotto = new int[6];
	
	{
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);									
			}
	}

	public Lotto() {
		
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	
	public int[] getlotto() {
		return lotto;
	}
	
	public int[] information() {
		return lotto;
	}
	
	
	
}
