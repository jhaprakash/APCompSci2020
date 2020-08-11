package stickgame.oop;

import stickgame.oop.game.Game;
import stickgame.oop.game.StickPicker;
import stickgame.oop.player.ComputerPlayer;
import stickgame.oop.player.Player;

import java.util.Scanner;

public class GameBoard {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name: ");
        String name = scanner.next();
        Player player = new Player(name);
        playGame(player);
        while (playAgain()) {
            playGame(player);
        }
    }

    private static void playGame(Player player) {
        Player computer = new ComputerPlayer();
        Game game = new StickPicker(player, computer);
        game.startGame();
        game.play();
    }

    private static boolean playAgain() {
        Scanner scanner = new Scanner(System.in);
        char choice = ' ';
        while (choice == 'y' || choice == 'n') {
            System.out.println("Do you want to play again (y/n)?: ");
            String input = scanner.next();
            choice = input.charAt(0);
        }
        return choice == 'y';
    }
}
