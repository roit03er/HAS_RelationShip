package com.cjc;

import java.util.Scanner;

public class Sum_While {
	
	
	
	static  public int SumOfNo (int a ) {
		int sum=0;
			while (a>0) {
				int digit= a%10;
				 sum = digit +sum;
				 a =a/10;
				 
						 }
			return sum;
		}
	
	
	
	 static public boolean isPalindrome (int a ) {
		int rev=0;
		int original=a;
		
		while (a>0) {
			int digit = a %10;
			 rev = (rev*10)+digit;
			 a =a/10;
			 
		}
		if (rev == original) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
//			int n =Sum_While.SumOfNo(sc.nextInt());
//			System.out.println(n);
			int no = sc.nextInt();
			boolean b = Sum_While.isPalindrome(no);
			
			if (b) {
				System.out.println(no+": Palindrome");
			}else {
				System.out.println(no+": Not Palindrome");
			}
		}
}
