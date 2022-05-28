package com.bridgelabz;
import java.util.*;

public class Swaping {
	public static void Swap(int a,int b) {
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Swap(a,b);
		
	}

}
