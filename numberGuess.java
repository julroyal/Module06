import java.util.Scanner;
import java.util.Random;

public class numberGuess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int random = r.nextInt(9) + 1;
        int guess = 0;

        System.out.println("Guess a number 1-10: ");
        guess = in.nextInt();
        while (guess != random)
        {
            if(guess > random)
                System.out.println("Your guess was too high! Try again: ");
            else
                System.out.println("Your guess was too low! Try again: ");
            guess = in.nextInt();
        }
        System.out.println("Congrats! Your guess was correct.");
    }
}