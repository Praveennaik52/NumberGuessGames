import java.util.Random;
import java.util.Scanner;

public class Numberguess {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int score = 0;
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        
	        while (true) {
	            int lowerBound = 1;
	            int upperBound = 100;
	            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	            int maxAttempts = 5;
	            int attempts = 0;
	           
	            System.out.println("I've selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
	            
	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;
	                
	                if (userGuess < lowerBound || userGuess > upperBound) {
	                    System.out.println("Please guess a number between " + lowerBound + " and " + upperBound + ".");
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Try a higher number.");
	                } else if (userGuess > targetNumber) {
	                    System.out.println("Try a lower number.");
	                } else {
	                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                    score += maxAttempts - attempts + 1;
	                    break;
	                }
	                
	                if (attempts == maxAttempts) {
	                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
	                }
	            }
	            
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgain = scanner.next();
	            if (!playAgain.equalsIgnoreCase("yes")) {
	                System.out.println("Thanks for playing! Your total score is: " + score);
	                break;
	            }
	        }
	        
	        scanner.close();
	    }
	}
