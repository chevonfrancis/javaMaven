package com.qa.solidPrinciple;

public class Runner {
	
	public static void main(String[] args) {
		
		FormalGreeting fg = new FormalGreeting();
		
		CasualGreeting cg = new CasualGreeting();
		
		Greeter g = new Greeter(fg);
		
		System.out.println(g.greet());
		
		
	}

}
