package com.faize;

public class PatternMatch {
	
	public void printPattern(PatternPrint patternPrint)
	{
		int options []= {2,3,4};
		int total = 12;
		patternPrint.printPattern(options, total);
	}

	public static void main(String[] args) {
		
		PatternMatch pm = new PatternMatch();
		
		PatternPrint patternPrint = (options, total) -> {
			
			for (int i =0 ; i < options.length ; i++) {
				
				for( int j=0 ; j < options.length; j++)
				{
					int result = Math.abs(total/options[i]);
					while (result > 0) {
						if ((result * options [i]) + options [j] == total)
						{
							int count = result;
							while(count > 0)
							{
								System.out.print(options [i] + " ");
								count --;
							}
							System.out.println(options[j]);
						}
						else if (options[i] != options[j] && (result * options [i]) + (result * options [j]) == total)
						{
							int count = result;
							while(count > 0)
							{
								System.out.print(options [i] + " ");
								count --;
							}
							count = result;
							while(count > 0)
							{
								System.out.print(options [j] + " ");
								count --;
							}
							System.out.println("");
						}
						result--;
					}
					
				}
				}
		};
		
		pm.printPattern(patternPrint);
	}
}
