package com.bridgelabz;
import java.util.*;

public class QuotinetAndReminder {
	public static void main(String [] args) {
		Scanner aa = new Scanner (System.in);
		
		System.out.println("Enter the divisible");
		int first = aa.nextInt();
		System.out.println("Enter the divisior");
		int second = aa.nextInt();
		float quotinet=first/second;
		float reminder=first%second;
		System.out.println("quotinet:"+quotinet);
		System.out.println("reminder"+reminder);
		

	}
}


