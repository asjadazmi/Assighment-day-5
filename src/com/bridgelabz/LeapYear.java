package com.bridgelabz;
import java.util.Scanner;

public class LeapYear {
	public static void checkleapyear(int year){
            if (year%4==0 || year%400==0 && year!=0) {
				System.out.println("is leap year");
				}
			else {
				System.out.println("not leap year");
			}
		}
			
		public static void main(String args[]) {
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the year");
			int year=sc.nextInt();
			checkleapyear(year);
			
			
			
					
		}

	}
	