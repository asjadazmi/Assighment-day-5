package com.bridgelabz;

public class Reverse {
	public static void reverse() {
		String name="asjad";
		String rev="";
		int len=name.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
	
	System.out.println(rev);
}
	public static void main(String args[]) {
		reverse();
	}
	}


