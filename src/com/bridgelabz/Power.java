package com.bridgelabz;
import java.util.*;
import java.util.*;

public class Power {
	public static void main(String []args) {
		Scanner aa = new Scanner(System.in);
		
		System.out.println("Enter the First Number:");
		int Num =aa.nextInt();
		System.out.println("Enter the power how much you want:");
		int power = aa.nextInt();
		
		int num=1;
		for (int i=1; i<=power ; i++)
		{
			num =num*Num;
		}
			System.out.println("Power of two Number:" +num);
			System.out.println();
			
	}
}	
	


