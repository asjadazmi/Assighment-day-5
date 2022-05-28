package com.bridgelabz;
import java.util.Scanner;
import java.util.*;

public class FlipCoin {
	

		
		static  Random random=new Random();
		static Scanner sc=new Scanner(System.in);
		static float heads;
		static float tails;
		
		
		public static void main(String[] args) {
			
            System.out.println("how many times you need to flip the coin:");
			int num = sc.nextInt();
			
			for (int i = 0; i < num; i++) 
			{
	            float flip = flip();
	            System.out.println(flip);
	            if (flip > 0.5) 
	            {
	                heads++;
	            } else {
	            	tails++;
	            }
	    }
			System.out.println(heads);
			System.out.println(tails);
			double percentHeads=(heads /(heads + tails))* 100;
		    double percentails=(tails/(heads+tails))*100;
		    System.out.println("Heads percentage"+percentHeads);
		   System.out.println("Tails percentage"+percentails);
		   
		   
		}
		static float flip()
		{
		
		return random.nextFloat();


		}
		

		}




