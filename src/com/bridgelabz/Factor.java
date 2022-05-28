package com.bridgelabz;
import java.util.*;

public class Factor {
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num =aa.nextInt();
		
		int fact=1;
		for( int i=2; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("Total output of this prime factorial:" +fact);
		
	
	}
}


