package brickbreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;

    // Initial score.
    private int score = 0;

    // Total bricks to break = 21
    private int totalBricks = 7*3;

    // Timer to keep track of time.
    private Timer timer;

    // Delay to determine speed of ball.
    private int delay = 8;

    // Starting position for slider
    private int playerX = 310;

    // Starting position for the ball 120x350
    private int ballPosX = 120;
    private int ballPosY = 350;

    // Direction of the ball.
    private int ballDirX = -1;
    private int ballDirY = -2;

    // Brick map generator
    private MapGenerator mapGenerator;

    public Gameplay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        timer = new Timer(delay, this);
        timer.start();
        mapGenerator = new MapGenerator(3, 7);
    }

    public void paint(Graphics g) {
        // Background
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 692, 592);

        // Draw brick map
        mapGenerator.draw((Graphics2D) g);

        // Border
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);
        // Border at bottom not needed as the ball should simply drop off.

        // Scores
        g.setColor(Color.WHITE);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("" + score, 590, 30);

        // Slider
        g.setColor(Color.GREEN);
        g.fillRect(playerX, 550, 100, 8);

        // Ball
        g.setColor(Color.YELLOW);
        g.fillOval(ballPosX, ballPosY, 20, 20);

        // If all bricks are destroyed
        if (totalBricks < 0) {
            play = false;
            ballDirX = 0;
            ballDirY = 0;
            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Final Score: " + score, 190, 300);

            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press enter to restart", 230, 350);

        }

        // Ball fell off the game
        if (ballPosY > 570) {
            play = false;
            ballDirX = 0;
            ballDirY = 0;
            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Game Over, Score: " + score, 190, 300);

            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press enter to restart", 230, 350);

        }

        // Manually free graphic resources.
        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();

        if (play) {

            if (new Rectangle(ballPosX, ballPosY, 20, 20)
                    .intersects(new Rectangle(playerX, 550, 100, 8))) {
                ballDirY = -ballDirY;
            }

            ballPosX += ballDirX;
            ballPosY += ballDirY;
            // Left border
            if (ballPosX < 0) {
                ballDirX = -ballDirX;
            }
            // Top border
            if (ballPosY < 0) {
                ballDirY = -ballDirY;
            }

            // Right border
            if (ballPosX > 670) {
                ballDirX = -ballDirX;
            }

            A: for (int i = 0; i < mapGenerator.map.length; i++) {
                for (int j = 0; j < mapGenerator.map[0].length; j++) {
                    // If brick is present, detect collision
                    if (mapGenerator.map[i][j] > 0) {
                        int brickX = j * mapGenerator.brickWidth + 80;
                        int brickY = i * mapGenerator.brickHeight + 50;
                        int brickWidth = mapGenerator.brickWidth;
                        int brickHeight = mapGenerator.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballPosX, ballPosY, 20, 20);
                        Rectangle brickRect = rect;

                        if (ballRect.intersects(brickRect)) {
                            mapGenerator.setBrickValue(0, i, j);
                            totalBricks--;
                            score += 5;

                            // Detect condition when ball hits bricks by the border
                            if (ballPosX + 19 <= brickRect.x || ballPosX + 1 >= brickRect.x + brickRect.width) {
                                ballDirX = -ballDirX;
                            }
                            else {
                                ballDirY = -ballDirY;
                            }
                            break A;
                        }
                    }
                }
            }
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // No implementation.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            }
            else {
                moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            }
            else {
                moveLeft();
            }
        }

        if (!play && e.getKeyCode() == KeyEvent.VK_ENTER) {
            play = true;
            ballPosX = 120;
            ballPosY = 350;
            ballDirX = -1;
            ballDirY = -2;
            playerX = 310;
            totalBricks = 7*3;
            score = 0;
            mapGenerator = new MapGenerator(3, 7);

            repaint();
        }
    }

    /**
     * Move slider right by 20px.
     */
    private void moveRight() {
        play = true;
        playerX += 20;
    }

    /**
     * Move slider right by 20px.
     */
    private void moveLeft() {
        play = true;
        playerX -= 20;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No implementation.
    }
}
