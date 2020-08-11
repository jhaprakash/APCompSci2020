package stickgame.oop.player;

import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer() {
        super("Computer");
    }

    @Override
    public int pickSticks() {
        Random random = new Random();

        return 1 + random.nextInt(2);
    }
}
