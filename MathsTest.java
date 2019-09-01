//JPG Verster, last change 20/11/2017

import java.util.*;
import java.lang.Math;

public class MathsTest
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
			
		mainMenu();
	}
	
	public static void mainMenu()
	{
		Scanner input = new Scanner(System.in);
		
		int program = 0;
		int total = 0;
		int number = 0;
		int sum = 0;
		int product = 1;
		int max = 0;
		int min = 0;
		int power = 0;
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		
		while (program != -1)
		{
			System.out.println("\nChoose a number from the list:");
			System.out.println("1 - Calculate Sum");
			System.out.println("2 - Calculate Difference");
			System.out.println("3 - Calculate Product");
			System.out.println("4 - Calculate Max");
			System.out.println("5 - Calculate Min");
			System.out.println("6 - Calculate Max and Min");
			System.out.println("7 - Calculate Factorial");		//Only up to 21... created another program using BigInteger to increase number
			System.out.println("8 - Calculate Power");
			System.out.println("9 - Calculate Distance");
			System.out.println("10 - Calculate Prime");
			System.out.println("11 - Prime Numbers");
			
			System.out.println();
			System.out.println("Type -1 to exit");
			
			System.out.print("\nChoose number: ");
			program = input.nextInt();
			System.out.println();
		
			if (program < -1 || program == 0)
			{
				mainMenu();
			}
		
			if (program == 1)		//Calculate Sum	(Error code: -1)
			{
				System.out.print("Please enter the total amount of numbers to sum up: ");
				total = input.nextInt();
				
				System.out.println("\nThe sum is: " + calculateSum(number, total));
			}
			
			if (program == 2)
			{
				System.out.print("Please enter the total amount of numbers to difference: ");
				total = input.nextInt();
				
				System.out.println("\nThe difference is: " + calculateDiff(number, total));
			}
				
			if (program == 3)		//Calculate Product (Error code: -2)
			{
				System.out.print("Please enter the total amount of numbers to multiply: ");
				total = input.nextInt();
				
				if (calculateProduct(number, total) == -1)
				{
					System.out.println();
					System.out.println("ERROR! The product is out of bounds... ");
				}
				else
				{
					System.out.println("\nThe product is: " + calculateProduct(number, total));
				}
			}
			
			if (program == 4)		//Calculate Max
			{
				System.out.print("Please enter the total amount of numbers to check: ");
				total = input.nextInt();
				
				System.out.println("\nThe max number is: " + calculateMax(number, total));
			}
			
			if (program == 5)		//Calculate Min
			{
				System.out.print("Please enter the total amount of numbers to check: ");
				total = input.nextInt();
				
				System.out.println("\nThe min number is: " + calculateMin(number, total));
			}
			
			if (program == 6)		//Calculate Max and Min
			{
				System.out.print("Please enter the total amount of numbers to check: ");
				total = input.nextInt();
				
				calculateMaxMin(number, total);
			}
			
			if (program == 7)		//Calculate Factorial
			{
				System.out.print("Please enter number factorial: ");
				number = input.nextInt();
				
				System.out.println("\nThe factorial is: " + calculateFactorial(number));
			}
			
			if (program == 8)		//Calculate Power
			{
				System.out.print("Please enter base: ");
				number = input.nextInt();
		
				System.out.print("Please enter power: ");
				power = input.nextInt();
				
				System.out.println("\nThe answer is: " + calculatePower(number, power));
			}
			
			if (program == 9)		//Calculate Distance
			{
				System.out.print("Please enter first x-coordinate: ");
				x1 = input.nextInt();
				
				System.out.print("Please enter first y-coordinate: ");
				y1 = input.nextInt();
				
				System.out.print("Please enter second x-coordinate: ");
				x2 = input.nextInt();
				
				System.out.print("Please enter second y-coordinate: ");
				y2 = input.nextInt();
				
				System.out.println("\nThe distance is: " + calculateDistance(x1, y1, x2, y2));
			}
			
			if (program == 10)		//Calculate Prime
			{
				System.out.print("Please enter number (-99 to exit): ");
				number = input.nextInt();
				
				while (number != -99)
				{
					if(number > 0)
					{
						isPrime(number);
					}
					else
					{
						System.out.println("Please enter a number higher than zero!");
					}
					
					System.out.print("\nPlease enter number (-99 to exit): ");
					number = input.nextInt();
					
				}
			}
			
			if (program == 11)		//Calculate Prime Numbers
			{
				while(number != -1)
				{
					System.out.print("Please enter amount of prime numbers to show (Type -1 to return to main menu): ");
					number = input.nextInt();
					
					primeNumbers(number);
					System.out.println();
				}
			}
			
			if (program == 12)
			{
				
			}
		}
		
		if (program == -1)		//Exit Program
		{
			System.out.println("Good bye ^^");
			System.exit(0);
		}
	}
	
	public static int calculateSum(int number, int total)		//(Error code: -1)
	{	
		Scanner input = new Scanner(System.in);
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		int sum = 0;
	
		for (int i = 1; i <= total; i++)
		{
			System.out.print("Please enter number " + i + ": ");
			number = input.nextInt();
			
			sum += number;
		}
		
		if (sum < max + number)
		{
			System.out.println("ERROR! Out of bounds... Sum returned as -1");
			return sum = -1;
		}
		else
		{			
			return sum;
		}
	}
	
	public static int calculateDiff(int number, int total)		//(Error code: -1)		
	{	
		Scanner input = new Scanner(System.in);
		int numbers = 0;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		int diff = 0;
	
		for (int i = 1; i <= total; i++)
		{
			System.out.print("Please enter number " + i + ": ");
			number = input.nextInt();
			
			if (numbers != 0)
			{
				diff -= number;
			}
			else
			{
				diff += number;
			}
			
			numbers++;
		}
		
		if (diff < max + number)
		{
			System.out.println("ERROR! Out of bounds... Sum returned as -1");
			return diff = -1;
		}
		else
		{			
			return diff;
		}
	}
	
	public static int calculateProduct(int number, int total)		//(Error code: -2)		//ERROR! NOT WORKING
	{
		Scanner input = new Scanner(System.in);
		
		int test = 1;
		int product = 1;
		
		for (int i = 1; i <= total; i++)
		{
			System.out.print("Please enter number " + i + ": ");
			number = input.nextInt();
			test += number;
			product *= number;	
			
			if (test - number == product / number)
			{
				test = product;
			}
			else
			{
				product = -2;
			}
		}
			
		return product;
	}
	
	public static int calculateMax(int number, int total)
	{
		Scanner input = new Scanner (System.in);
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 1; i <= total; i++)
		{
			System.out.print("Please enter number " + i + ": ");
			number = input.nextInt();
			
			if (number > max)
			{
				max = number;
			}
		}
		
		return max;
	}
	
	public static int calculateMin(int number, int total)
	{
		Scanner input = new Scanner (System.in);
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 1; i <= total; i++)
		{
			System.out.print("Please enter number " + i + ": ");
			number = input.nextInt();
			
			if (number < min)
			{
				min = number;
			}
		}
		
		return min;
	}
	
	public static void calculateMaxMin(int number, int total)
	{
		Scanner input = new Scanner (System.in);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 1; i <= total; i++)
		{
			System.out.print("Please enter number " + i + ": ");
			number = input.nextInt();
			
			if (number > max)
			{
				max = number;
			}
			
			if (number < min)
			{
				min = number;
			}
		}
		
		System.out.println("\nThe min number is: " + min);
		System.out.println("The max number is: " + max);
	}
	
	public static long calculateFactorial(long number)
	{
		Scanner input = new Scanner(System.in);
		long factorial = 1;
		
		for(long i = number; i > 0; i--)
		{
			factorial *= i;
		}
		
		return factorial;
	}
	
	public static int calculatePower(int number, int power)
	{
		number = (int)Math.pow(number, power);
		
		return number;
	}
	
	public static double calculateDistance(int x1, int y1, int x2, int y2)
	{
		double distance = 0;
		
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		return distance;
	}
	
	public static boolean calculatePrime(int number)		//used in isPrime
	{
		final int SIZE = number;
		int [] primeArray = new int [SIZE];
		int counter = 1;
		int previous = 0;
		
		primeArray[0] = 2;
		
		boolean isPrime = false;
		boolean isMatch = false;
		
		for (int i = 1; i < number; i++)		//From 2nd position in array to specified number
		{
			isPrime = false;		//Assume next number is not prime number
			
			while (isPrime == false)		//if not prime
			{
				primeArray[i] = primeArray[i - 1] + counter;		//set next number to test for prime
				
				if (primeArray[i] % primeArray[previous] != 0)		//Check if number is divisable by previous numbers in array, if not- enter
				{
					if (previous < i - 1)		//Sifer through all numbers in array
					{
						previous++;
					}
					else		//If all numbers in array are used, number must be prime... reset and test next number in array
					{
						previous = 0;
						counter = 1;
						isPrime = true;
					}
				}
				else		//if number is divisable, move on to next number
				{
					isPrime = false;
					previous = 0;
					counter++;
				}
			}
		}
		
		for (int z = 0; z < number; z++)
		{
			if(primeArray[z] == number)
			{
				isMatch = true;
			}
		}
		
		return isMatch;
	}
	
	public static void isPrime(int number)
	{
		boolean isPrime = calculatePrime(number);
		String result = "";
		
		if (isPrime)
		{
			result = " is a prime number";
		}
		else
		{
			result = " is not a prime number";
		}
		
		System.out.println(number + result);
	}
	
	public static void primeNumbers(int number)
	{
		if(number == -1)
		{
			mainMenu();
		}
		
		final int SIZE = number;
		int [] primeArray = new int [SIZE];
		int counter = 1;
		int previous = 0;
		
		primeArray[0] = 2;
		
		boolean isPrime = false;
		
		for (int i = 1; i < number; i++)		//From 2nd position in array to specified number
		{
			isPrime = false;		//Assume next number is not prime number
			
			while (isPrime == false)		//if not prime
			{
				primeArray[i] = primeArray[i - 1] + counter;		//set next number to test for prime
				//System.out.println("While !isPrime... counter = " + counter + " previous = " + previous + ", number is: " + primeArray[i] + ", isPrime = " + isPrime);
				
				if (primeArray[i] % primeArray[previous] != 0)		//Check if number is divisable by previous numbers in array, if not- enter
				{
					if (previous < i - 1)		//Sifer through all numbers in array
					{
						previous++;
						//System.out.println("if previous < i - 1... previous = " + previous + ", isPrime = " + isPrime);
					}
					else		//If all numbers in array are used, number must be prime... reset and test next number in array
					{
						previous = 0;
						counter = 1;
						isPrime = true;
						//System.out.println("if previous !< i - 1... previous and i = " + previous + " " + i + ", number is: " + primeArray[i] +", isPrime = " + isPrime);
					}
				}
				else		//if number is divisable, move on to next number
				{
					isPrime = false;
					previous = 0;
					counter++;
					//System.out.println("if % = 0... previous = " + previous + ", isPrime = " + isPrime);
				}
			}
		}
		
		for (int z = 1; z <= number; z++)
		{
			System.out.println("Number " + z + " is: " + primeArray[z-1]);
		}
		
		/*for (int i = 4; i < number; i++)		//Old Method... 
		{
			primeArray[i] = primeArray[i -1] + 1;		//primeArray[4] = 7 + 1 = 8
			//isPrime = true;
			
			for (int j = i - 1; j < number; j++)
			{
				System.out.println("BEFORE IF: " + primeArray[i] + "number: " + number);
				isPrime = true;
			
				if (primeArray[i] % primeArray[0] == 0)		//if (... % 2 == 0)
				{
					isPrime = false;
					System.out.println("IF % 2: " + primeArray[i]);
				}
				
				if (primeArray[i] % primeArray[1] == 0)
				{
					isPrime = false;
					System.out.println("IF % 3: " + primeArray[i]);
				}
				
				if (primeArray[i] % primeArray[2] == 0)
				{
					isPrime = false;
					System.out.println("IF % 5: " + primeArray[i]);
				}
				
				if (primeArray[i] % primeArray[3] == 0)
				{
					isPrime = false;
					System.out.println("IF % 7: " + primeArray[i]);
				}
				
				if (primeArray[i] % primeArray[0] != 0 && primeArray[i] % primeArray[1] != 0 && primeArray[i] % primeArray[2] != 0 && primeArray[i] % primeArray[3] == 0)
				{
					isPrime = true;
					System.out.println("IF !% 2, 3, 5, 7: " + primeArray[i]);
				}
				
				if (isPrime == false)
				{
					primeArray[i]++;
					System.out.println("IF FALSE (++): " + primeArray[i]);
				}
				else
				{
					j = number;
					System.out.println("IF TRUE: " + primeArray[i]);
				}
				
				
			}
			System.out.println("Test: " + primeArray[i]);
		}
		
		for (int z = 1; z <= number; z++)
			{
				System.out.println("Number " + z + " is: " + primeArray[z-1]);
			}
			
			*/
	}
	
	
	
}