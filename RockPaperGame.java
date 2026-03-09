import java.util.Scanner;
import java.util.Random;

public class RockPaperGame {
    public static void main(String[] args) {
        String[] choice = {"scissor", "rubber", "rock"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String feedback="yes";
        do {

            System.out.println("enter your guess from options (scissor,rubber,rockk)");
            String guess = scanner.nextLine();
            if (!guess.equals("scissor") && !guess.equals("rubber") && !guess.equals("rock")) {
                System.out.println("invalid answer🚫");
                continue;

            }
            String computerguess = choice[random.nextInt(3)];

            if (guess.equals(computerguess)) {
                System.out.println("it's tie!");
            } else if (guess.equals("scissor") && computerguess.equals("rubber") || guess.equals("rubber") && computerguess.equals("rock") || guess.equals("rock") && computerguess.equals("scissor")) {
                System.out.println("you win💕💕💕");
            } else {
                System.out.println("you lose😒😒😒");

            }

            System.out.println("do you want to continue the game (yes/no)");
             feedback = scanner.nextLine().toLowerCase();

        }while (feedback.equals("yes"));
            System.out.println("Thanks for playing👌👌👌");

scanner.close();
    }
}