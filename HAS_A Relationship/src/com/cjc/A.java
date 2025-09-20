package com.cjc;

import java.util.Scanner;

public class A {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int [] arr = new int [n];
			
			for (int i = 0; i<=arr.length-1;i++) {
				arr[i]=sc.nextInt();
			}
			
			for (int i =0; i<=arr.length-1;i++) {
				System.out.println(arr[i]);
			}
			
			
			
		}
}
