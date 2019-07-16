package com.faize;

public class PatternMatch2 {
	
	public void printPattern(PatternPrint patternPrint)
	{
		int options []= {2,3,4};
		int total = 12;
		patternPrint.printPattern(options, total);
	}

	public static void main(String[] args) {
		
		PatternMatch2 pm = new PatternMatch2();
		
		PatternPrint patternPrint = (options, total) -> {
			
			for (int i =0 ; i < options.length ; i++) {
				
		
			}
		};
		
		pm.printPattern(patternPrint);
	}
}
