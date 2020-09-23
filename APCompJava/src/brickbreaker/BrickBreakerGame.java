package brickbreaker;

import javax.swing.*;

public class BrickBreakerGame {
    public static final int frameX = 10;
    public static final int frameY = 10;
    public static final int frameWidth = 700;
    public static final int frameHeight = 600;

    public static void startGame() {
        Gameplay gameplay = new Gameplay();
        JFrame frame = new JFrame();
        frame.setBounds(frameX, frameY, frameWidth, frameHeight);
        frame.setTitle("Brick Breaker");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(gameplay);
    }
}
