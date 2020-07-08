package com.codedifferently.stayready.lab04;
import java.util.Scanner;


public class CarRide {
	
	
	static String answer;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println(areWeThereYet());
		
	}
	
	
	
	

    public static String areWeThereYet(){	
    	
    	System.out.println("Are we there yet?");
    	
    	answer = scanner.nextLine();
    	
    	
    	if(!answer.equalsIgnoreCase("yes")) {

    			areWeThereYet();
    		}
    	
    	
    		return "Good!";
    	}
    
 
}
