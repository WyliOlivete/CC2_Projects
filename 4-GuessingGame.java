//Activity 4 OLIVETE
package guessinggame;

import java.util.Scanner;

public class GuessingGame {

    //15 blank spaces
    public static void main(String[] args) {
        int numToGuess = 0, guess = 0;
        Scanner scanner = new Scanner(System.in);
        
        do {
        System.out.print("Enter a number to be guessed (1 - 1000): ");
        numToGuess = scanner.nextInt();
        } while (numToGuess < 1 || numToGuess > 1000);
        
        
        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }
        
        System.out.print("Guess the number: ");
        guess = scanner.nextInt();
        
        if (guess != numToGuess) {
            if (numToGuess % 2 == 0) {
                System.out.println("Wrong. Hint: The number is even.");
            } else {
                System.out.println("Wrong. Hint: The number is odd.");
            }
            System.out.print("Guess again: ");
            guess = scanner.nextInt();
        } else {
            System.out.println("Correct! You guessed it!");
        }
        
        while (guess != numToGuess) {
            if (guess < numToGuess) {
                System.out.println("Wrong. Hint: The number is higher.");
            } else {
                System.out.println("Wrong. Hint: The number is lower.");
            }
            System.out.print("Guess again: ");
            guess = scanner.nextInt();
        }
        
        if (guess == numToGuess) {
            System.out.println("Correct! You guessed it!");
        }
        
    }
    
}
