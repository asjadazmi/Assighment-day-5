package com.bridgelabz;

public class Vowel {
	
		public static void vowel(char ch) {

	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	            System.out.println(ch + " is vowel");
	        else
	            System.out.println(ch + " is consonant");

	    }
		public static void main(String args[]) {
			vowel('b');
		}
	}
