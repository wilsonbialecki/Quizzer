package modulus;

import java.util.Scanner;

public class Challenges
	{

		public static void main(String[] args)
			{
				IsItEven();
				ReportYear();
				Print();
				FizzBuzz();
			}
		public static void IsItEven()
			{
				Scanner userInput=new Scanner(System.in);
				System.out.println("Type a number to see if it is an even or an odd number. ");
				int number=userInput.nextInt();
				if (number%2==0)
					{
						System.out.println("Your number is even.");
					}
				else
					{
						System.out.println("Your number is odd.");
					}
			}
		public static void ReportYear()
		{
			Scanner userInput=new Scanner(System.in);
			System.out.println("Type a year. ");
			int number=userInput.nextInt();
			if(number%4==0)
				{
					System.out.println("That is a leap year.");
				}
			else
				{
					System.out.println("That is not a leap year.");
				}
		}
		public static void Print()
			{
				int[] numbers={2, 5, -7, 1, 3, 12, 19,-16, 4, 20};
				for (int i=0; i< numbers.length; i++)
					{
						if (i%3==0)
							{
								System.out.println(numbers[i]+" This is the third one.");
							}
					}
			}
		public static void FizzBuzz()
		{
			for (int i=1; i< 101; i++)
				{
				
					if(i%3==0 && i%5==0 )
					{
						System.out.println("FizzBuzz");;
						
						
					}
				else if(i% 3==0)
					{
						System.out.println("Fizz");;
						
						
					}
				else if(i% 5==0)
					{
						System.out.println("Buzz");;
						
						
					}
				else
					{
						System.out.println(i);
					}
				}
				}

	}
