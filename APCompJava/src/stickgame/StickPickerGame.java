package stickgame;

import java.util.Random;
import java.util.Scanner;

public class StickPickerGame {
    private static int total = 21;
    private static int player;
    private static int sticks;

    private static void initializeGame() {
        total = 21;
        System.out.println("Do you want to play first? yes(1) or no(2)");
        Scanner scanner = new Scanner(System.in);
        player = scanner.nextInt();
    }

    private static void getUserPick() {
        Scanner scanner = new Scanner(System.in);
        sticks = 0;
        while (sticks != 1 && sticks != 2) {
            System.out.println("Do you want to pick 1 or 2 sticks?");
            sticks = scanner.nextInt();
            if (sticks != 1 && sticks != 2) {
                System.out.println("You can only pick 1 or 2 sticks");
            }
        }
    }

    private static void userMove() {
        if (total <= 0) {
            return;
        }
        getUserPick();
        System.out.println("Player picked: " + sticks + " sticks");
        total -= sticks;
        if (total <= 0) {
            System.out.println("Player wins!!");
        }
    }

    private static void computerMove() {
        if (total <= 0) {
            return;
        }
        sticks = 0;
        Random random = new Random();
        sticks = random.nextInt(2) + 1;
        total -= sticks;
        System.out.println("Computer picked: " + sticks + " sticks");
        System.out.println("Number of sticks remaining: " + total);
        if (total <= 0) {
            System.out.println("Computer won!!");
        }
    }

    private static void game() {
        System.out.println("Total sticks to pick from: "+ total);
        while (total > 0) {
            if (player == 1) {
                userMove();
                computerMove();
            }
            else {
                computerMove();
                userMove();
            }
        }
    }

    private static boolean playMore() {
        Scanner scanner = new Scanner(System.in);
        char playAgain = ' ';
        while (playAgain != 'y' && playAgain != 'n') {
            System.out.println("Do you want to play the game again (y/n): ");
            String choice = scanner.next();
            playAgain = choice.charAt(0);
        }

        return playAgain == 'y';
    }

    public static void playGame() {

        do {
            initializeGame();
            game();
        } while (playMore());
        System.out.println("Well played!!");
    }
}
