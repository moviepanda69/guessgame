import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your guess (1-9): ");
        int x = sc.nextInt();

        if (x < 1 || x > 9) {
            System.out.println("Invalid guess, please enter a number between 1 and 9");
            return;
        }

        int y = (int)(Math.random() * 9) + 1;

        System.out.println("Computer guess = " + y);

        if (x == y) {
            System.out.println("You got it right!");
        } else if (x == y - 1 || x == y + 1) {
            System.out.println("Almost got it right");
        } else {
            System.out.println("You got it wrong");
        }

        sc.close();
    }
}
