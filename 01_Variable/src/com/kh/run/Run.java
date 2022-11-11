package com.kh.run;

import com.kh.variable.*;

public class Run {

	public static void main(String[]args) {
		A_Variable av = new A_Variable();
		//av.printVariable();
		//av.declareVariable();
		//av.initVariable();
		//av.constantVariable();
		
		B_KeybordInput bk = new B_KeybordInput();
		//bk.inputTest1();
		//bk.inputTest2();
		
		C_Cast cc = new C_Cast();
		//cc.autoCasting();
		
		D_Printf dp = new D_Printf();
		dp.printFtest();
		
	}
	
}
