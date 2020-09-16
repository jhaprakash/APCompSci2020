package brickbreaker;

import javax.swing.*;

/**
 * Credit: https://www.youtube.com/watch?v=K9qMm3JbOH0&ab_channel=AwaisMirza
 */
public class BrickBreakerGame {

    public static void startGame() {
        Gameplay gameplay = new Gameplay();
        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 700, 600);
        frame.setTitle("Brick Breaker");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameplay);
    }

}
