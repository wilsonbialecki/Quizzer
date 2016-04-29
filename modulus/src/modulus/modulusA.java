package modulus;

import java.util.Scanner;

public class modulusA
	{
		public static void main(String[] args)
			{
				startC();
				
			}
		public static void startC()
		{
			System.out.println("Hello, this a math quizing program.");
			Scanner userInput = new Scanner(System.in);
			System.out.println("How many questions would you like to be asked.");
			int userChoice= userInput.nextInt();
			int counter=0;
			Scanner user1 = new Scanner(System.in);
			System.out.println(userChoice+"%"+userChoice);	
			int userPick1= userInput.nextInt();
			if( userPick1== userChoice%userChoice)
				{
					System.out.println("That is right!");
					counter++;
					System.out.println("You're score is "+ counter);
				}
			 else  
				{
					System.out.println("That is wrong, the correct answer is "+ userChoice%userChoice);
				}
				
			System.out.println(userChoice-2+"%"+userChoice);
			int userPick2= userInput.nextInt();
			if( userPick2== userChoice-2%userChoice)
				{
					System.out.println("That is right!");
					counter++;
					System.out.println("You're score is "+ counter);
				}
			 else  
				{
					System.out.println("That is wrong, the correct answer is "+ userChoice%userChoice);
				}
				
			for(int i=0; i< userChoice-2;i++)
				{
	
			int modone= (int)(Math.random()*userChoice+userChoice)+3;
			int modtwo= (int)(Math.random()*userChoice)+1;
			Scanner user = new Scanner(System.in);
			System.out.println("What is "+ modone+ "%"+ modtwo );
			int userPick= userInput.nextInt();
			if( userPick== modone % modtwo)
				{
					System.out.println("That is right!");
					counter++;
					System.out.println("You're score is "+ counter);
				}
			 else  
				{
					System.out.println("That is wrong, the correct answer is "+ modone%modtwo);
				}
			
				}
			System.out.println(counter+" was your final score.");
		}
	}
