package Week2.day1;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) {
		//*Declare a String 
		String x = "stops";
	// *Declare another String
		String y = "pooop"; 
		char a[] = x.toCharArray();
				char b[]= y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		Boolean result = Arrays.equals(a,b);
		if(result== true)
		{
			System.out.println(" it is anagram");
		}
		else
		{
			System.out.println("it is not anagram");
		}
		}
		}
	