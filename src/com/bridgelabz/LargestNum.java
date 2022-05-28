package com.bridgelabz;
import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args ) {
		//object of the Scanner class
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st num:");
		int a =Sc.nextInt();
		System.out.println("Enter the 2nd Num:");
		int b = Sc.nextInt();
		System.out.println("Enter the 3rd Num:");
		int c =Sc.nextInt();
		int temp;
		int largest;
		temp=a>b?a:b;
		largest=c>temp?c:temp;
		System.out.println("The largest : " +largest);
		
	}

	

}
