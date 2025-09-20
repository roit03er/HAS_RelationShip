package com.cjc;

public class new_Line {
		public static void main(String[] args) {
			int num =121;
			while (num>0) {
				int digit= num%10;
				num=num/10;
				System.out.println(digit);
			}
		}
}
