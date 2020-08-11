package stickgame.oop.game;

import stickgame.oop.player.Player;

import java.util.Scanner;

public class StickPicker extends Game {

    private static final int TOTAL_STICKS_TO_PICK = 21;
    private int sticksToPick = TOTAL_STICKS_TO_PICK;
    private boolean isPlayer1Turn = false;

    public StickPicker(Player first, Player second) {
        super(first, second);
    }

    @Override
    public void startGame() {
        System.out.println("Starting StickPicker Game...");
        System.out.println("Make a choice: ");
        System.out.println("1. If you want to move first");
        System.out.println("2. If you want to move second");

        Scanner scanner = new Scanner(System.in);

        if (scanner.nextInt() == 1) isPlayer1Turn = true;
        else isPlayer1Turn = false;

        sticksToPick = TOTAL_STICKS_TO_PICK;
    }

    @Override
    public void stopGame() {
        System.out.println("Stopping StickPicker Game...");
        sticksToPick = TOTAL_STICKS_TO_PICK;
    }

    @Override
    public void play() {
        while (sticksToPick > 0)
        {
            if (isPlayer1Turn) {
                if (playerPlay(first))  break;
                if (playerPlay(second)) break;
            }
            else {
                if (playerPlay(second)) break;
                if (playerPlay(first))  break;
            }
        }
    }

    private boolean playerPlay(Player player)
    {
        int sticksPicked = player.pickSticks();
        sticksToPick -= sticksPicked;
        printGameStats(player, sticksPicked);
        if (sticksToPick <= 0) {
            System.out.println(player.getName() + " won the game");
            return true;
        }
        return false;
    }

    private void printGameStats(Player player, int sticks) {
        System.out.println(player.getName() + " picked [" + sticks + "] sticks.");
        System.out.println("Total sticks remaining: " + sticksToPick);
    }
}
