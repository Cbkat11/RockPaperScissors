import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String[] rpscsh = {"r", "p", "s", "c", "sh"};
            String computerMove = rpscsh[new Random().nextInt(rpscsh.length)];


            String playerMove;

            while (true) {
                System.out.println("Please enter your move (r,p,s,c, or sh)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s") || playerMove.equals("c") || playerMove.equals("sh")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");
            }
            System.out.println("computer played: " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("Tie game!");

            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p") || (computerMove.equals("sh"))) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("s") || computerMove.equals("c")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s") || (computerMove.equals("c"))) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("r") || computerMove.equals("sh")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r") || (computerMove.equals("c"))) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("p") || computerMove.equals("sh")) {
                    System.out.println("You win!");

                }
            } else if (playerMove.equals("c")) {
                if (computerMove.equals("sh") || (computerMove.equals("r"))) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("p") || computerMove.equals("s")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("sh")) {
                if (computerMove.equals("s") || (computerMove.equals("p"))) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("c") || computerMove.equals("r")) {
                    System.out.println("You win!");
                }
            }

        System.out.println("Play again? (y/n)");
        String playAgian = scanner.nextLine();
        if (!playAgian.equals("y")) {
            break;
        }
    }
    }
}
