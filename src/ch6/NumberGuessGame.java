package ch6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class NumberGuessGame {

	public static void main(String[] args) {
		int attempts = 0;
		
		
		 System.out.println("Hello welcome to number guessing game");
		 
		 Scanner input = new Scanner(System.in);
		 int ranNum = (int)(Math.random()*100);
		 System.out.println("Guess a number between 1-100 you get 10 trys");
		 int guess = input.nextInt();
		/* 
		 while (guess != ranNum) {
			 attempts++;
			
			 
		 if (guess > ranNum) {
			 System.out.println("Guess Lower!");
			
		 }
		 else {
			 System.out.println("Guess higher");
			 
		 }
		 if (attempts ==10) {
				break;
			}
		  guess = input.nextInt();
		
		
		 }
		 if (guess == ranNum) {
			 System.out.print("you got it!"+ranNum);
		 }
		 else {
			 System.out.println("you lost");
		 }
			*/ 
		/* do {
			 
				
				 
			 if (guess > ranNum) {
				 System.out.println("Guess Lower!");
				
			 }
			 else {
				 System.out.println("Guess higher");
				 
			 }
			 
			  guess = input.nextInt();
			
			 
			 }while (guess != ranNum);
			 
		 if (guess == ranNum) {
			 System.out.print("you got it!"+ranNum);
		 }
		 else {
			 System.out.println("you lost");
		 }
		*/
		 for (guess=0; guess != ranNum; guess= input.nextInt()) {
			 if (guess > ranNum) {
				 System.out.println("Guess Lower!");
				
			 }
			 else {
				 System.out.println("Guess higher");
				 
			 }
			 
			  
			
			 
			 }while (guess != ranNum);
			 
		 if (guess == ranNum) {
			 System.out.print("you got it!"+ranNum);
		 }
		 else {
			 System.out.println("you lost");
		 }
			 }
		 }
		
	


