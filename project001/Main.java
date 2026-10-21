import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rn = new Random();

        int randomInt = rn.nextInt(100) + 1;
        
        System.out.println("Enter your guess number: ");
        Scanner scn = new Scanner(System.in);

        int guessNumber = scn.nextInt();
        int guessAttempt = 0;

        System.out.println("you guessed " + guessNumber);

        while (randomInt != guessNumber) {
            guessAttempt++;
            if (guessNumber < randomInt) {
                System.out.println("Too low, try again");
                guessNumber = scn.nextInt();
            }
            if (guessNumber > randomInt) {
                System.out.println("Too high, try again");
                guessNumber = scn.nextInt();
            }
            if (guessNumber == randomInt) {
                System.out.println("Correct guess");
                System.out.println("You guessed in " + guessAttempt + " attempts");
            }
        }
    }
}