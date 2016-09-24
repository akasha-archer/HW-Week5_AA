package nyc.c4q.akashaarcher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        boolean playAgain = false;

        do {
            game.startGame();
            System.out.println("Would you like to RIH-PLAY?");
            String play = game.readInput();
            if (play.equalsIgnoreCase("y") || play.equalsIgnoreCase("yes")) {
                playAgain = true;
            }
            else {
                playAgain = false;
                System.out.println("Bye bye. See you next time!");
            }
        }  while (playAgain);
    }
}