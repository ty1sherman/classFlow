import java.util.Scanner;
import java.util.Random;	// to use the random number generator
import java.util.*;

/**
	This project will be building an interactive command-line
	program which will take input from the user, process it, and then display the results.  
	
* @author Nelson T. Sherman
* Date:  12/3/2020

*/

public class ClassFlow {

	/************* MODULES ***************/
	public static class AsciiChars 
	{
	  public static void printNumbers()
	  {
	    // TODO: print valid numeric input
		  for(int x= 48; x < 58; x++)
			  System.out.print((char)x);
	  }

	  public static void printLowerCase()
	  {
	    // TODO: print valid lowercase alphabetic input
		  for(int x= 97; x < 122; x++)
			  System.out.print((char)x);
	  }

	  public static void printUpperCase()
	  {
	    // TODO: print valid uppercase alphabetic input
		  for(int x= 65; x < 90; x++)
			  System.out.print((char)x);
	  }
	  
	}  
	/************** Random Numbers MODULES *************/
	public static class randomNumbers
	{
		
		public static int quarterback(String qbQues, int qbNum)
		{
		 	Scanner keyboard = new Scanner(System.in);
		  
		 	if (qbQues.equals ("yes") || (qbQues.equals ("y")))
		 	{
		 		System.out.println("What is his jersey number?");
			
		 		qbNum = keyboard.nextInt();
		 	}
			return qbNum;  		
		}	
		
		public static int firstNum(int modelYear, int luckyNum) 
		{
			//Use the two digit model year of their car and add their lucky number to it.
			
			 int lottoNum1 = (modelYear + luckyNum);
			 
			 if (lottoNum1 > 75)
			 {
				 lottoNum1 = lottoNum1 - 75;
			 }
					 
					 return	lottoNum1;	 
		}
		
		public static int secondNum(int randNum, int rand2) 
		{
			//Use the random number between 1 and 50, subtracting one of the generated random numbers.
			int lottoNum2 = (randNum - rand2);
			
			if (lottoNum2 > 75)
			{
				lottoNum2 = (lottoNum2 -75);
			}
			else if (lottoNum2 < 1)
			{
				lottoNum2 =(lottoNum2 + 75);
			}
			
			return lottoNum2;
		}
		
		public static int thirdNum(int petAge, int modelYear) 
		{
			//Use the age of their favorite pet + their car model year.
			int lottoNum3 = (petAge + modelYear);
			
			if (lottoNum3 > 75)
			{
				lottoNum3 = (lottoNum3 -75);
			}
			
			return lottoNum3;
		}
		
		public static int fourthNum(int qbNum, int petAge, int luckyNum) 
		{
			//Favorite quarterback number + age of pet + lucky number.
			int lottoNum4 = (qbNum + petAge + luckyNum);
			
			if (lottoNum4 > 75)
			{
				lottoNum4 = (lottoNum4 -75);
			}
			
			return lottoNum4;
		
		}
		
		public static int fifthNum() 
		{
			//Use the value 42.
			int lottoNum5 = 42;
			
			return lottoNum5;
		}
		
		public static int magicBall(int luckyNum, int rand1)
		{
			
			int magicBall = (luckyNum  * rand1);
			
			if(magicBall > 75)
			{
				magicBall = (magicBall - 75);
			}
			return magicBall;
		}
	  
	
	}
	
	//********************* MAIN ************************
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		Random gen = new Random();
		
		//Variables
		String survey; //input from user to continue with survey
		String userName; //get users name
		String playAgain = null; //input from user to play again 
		String carStatus; String favPet;  String favActor; String qbQues;
		int randNum; int petAge; int luckyNum; int qbNum=0; int modelYear;
		int rand1, rand2, rand3;
		final int magic = 75; int magicBall = 0; int newMagicBall;
		int lottoNum1, lottoNum2, lottoNum3, lottoNum4, lottoNum5;
		
		// print the valid characters for ASCII input
		AsciiChars.printNumbers();
		System.out.println();
		AsciiChars.printLowerCase();
		System.out.println();
		AsciiChars.printUpperCase();
		
		//Get the users name.
		System.out.println("\n\nPlease enter your name: ");
		
		 userName = keyboard.next();
		
		System.out.print("\nHello " +userName +"\n\n");
		
		//ask the user if they want to take the survey
		System.out.println("Would you like to continue to the interactive portion? ");
		System.out.println("Enter yes or y to continue: ");
			survey = keyboard.next();
	
			
		if (survey.equals("yes") || (survey.equals("y")))
		{
			System.out.println("\nPlease answer the following questions: ");
			
			//Loop of questions for the user to answer
			do 
			{
				System.out.println("Do you have a red car? (yes, no): ");
					carStatus = keyboard.next();
				
				System.out.println("What is the name of your favorite pet? ");
					favPet = keyboard.next();
				
				System.out.println("What is the age of your favorite pet? ");
					petAge = keyboard.nextInt();
				
				System.out.println("What is your lucky number? ");
					luckyNum = keyboard.nextInt();
				
				System.out.println("Do you have a favorite quarterback? ");
					qbQues = keyboard.next();
					
					//calling module quarterBack
					randomNumbers.quarterback(qbQues, qbNum);
						
				System.out.println("What is the two digit model year of your car? ");
					modelYear = keyboard.nextInt();
				
				System.out.println("What is the first name of your favorite actor or actress? ");
					favActor = keyboard.next();
				
				System.out.println("Enter a random number between 1 and 50. ");
					randNum = keyboard.nextInt();
					
				System.out.println("We will now generate your lottery numbers: ");	
					rand1 = gen.nextInt(65);
					rand2 = gen.nextInt(65);
					rand3 = gen.nextInt(65);
					
				
					magicBall = randomNumbers.magicBall(luckyNum, rand1);		
						
					//Generate the non-magic numbers to be used as lottery numbers.
					lottoNum1 = randomNumbers.firstNum(modelYear, luckyNum); 		
					lottoNum2 = randomNumbers.secondNum(randNum, rand2);
					lottoNum3 = randomNumbers.thirdNum(petAge, modelYear);
					lottoNum4 = randomNumbers.fourthNum(qbNum, petAge, luckyNum);
					lottoNum5 = randomNumbers.fifthNum();
							
				System.out.println("\nLottery numbers: "+lottoNum1 +"," +lottoNum2 +"," +lottoNum3 +"," +lottoNum4 +"," +lottoNum5 +"  " +"Magic ball: " +magicBall);
					
				System.out.println("\nWould you like to Play again?  Type yes or y to play again ");
				playAgain =keyboard.next();
					
						if (!playAgain.equals( "yes")|| (!playAgain.equals ("y")))
						{
							System.out.println("Goodbye!");
							System.exit(0);
						}
					
			}
			while(playAgain.equals ("yes") ||(playAgain.equals ("y")));
				
			//System.out.println("Please return later to complete the survey");
		}
		else 
		{
			System.out.println("Please return later to complete the survey");
			System.exit(0);
		}
			
		
		keyboard.close();
	}
}
