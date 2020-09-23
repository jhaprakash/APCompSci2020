package brickbreaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    // Game is running
    private boolean play;

    // initial score
    private int score;

    // Timer to keep track of time.
    private Timer timer;

    // Delay to determine speed of ball.
    private int delay;

    // The slider
    private Slider slider;

    // The ball
    private Ball ball;

    private BrickWallGenerator wallGenerator;

    // 2px margin.
    public static final int MARGIN = 2;

    public static final int WIDTH = BrickBreakerGame.frameWidth - MARGIN;
    public static final int HEIGHT = BrickBreakerGame.frameHeight - MARGIN;

    private void initialize() {
        play = false;
        score = 0;
        delay = 8;
        slider.initialize();
        ball.initialize();
        wallGenerator.initialize(3, 7);
    }

    public Gameplay() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
        ball = new Ball();
        slider = new Slider();
        wallGenerator = new BrickWallGenerator(3, 7);
        initialize();
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g) {
        // Set background
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, WIDTH, HEIGHT);

        // Border
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 3, HEIGHT);          // Left border
        g.fillRect(0, 0, WIDTH, 3);          // Top border
        g.fillRect(WIDTH, 0, 3, HEIGHT);  // Right border
        // Border at bottom not needed as the ball should simply drop off.

        // Scores
        g.setColor(Color.WHITE);
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("" + score, 590, 30);

        // Ball
        ball.draw(g);

        // Slider
        slider.draw(g);

        // Draw brick wall
        wallGenerator.draw((Graphics2D) g);

        // All bricks have been destroyed
        if (wallGenerator.totalBricks <= 0) {
            play = false;
            ball.ballDirX = 0;
            ball.ballDirY = 0;

            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Final Score: " + score, 190, 300);

            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press enter to restart", 230, 350);
        }

        // Ball fell off the game
        if (ball.ballPosY > (HEIGHT - slider.sliderHeight)) {
            play = false;
            ball.ballDirX = 0;
            ball.ballDirY = 0;

            g.setColor(Color.RED);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString("Game Over, Score: " + score, 190, 300);

            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString("Press enter to restart", 230, 350);
        }

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();

        if (play) {
            if (ball.getRectangle().intersects(slider.getRectangle())) {
                ball.ballDirY = -ball.ballDirY;
            }
            ball.move();

            A: for (int i = 0; i < wallGenerator.map.length; i++) {
                for (int j = 0; j < wallGenerator.map[0].length; j++) {
                    // If brick is present, detect collision
                    if (wallGenerator.map[i][j] > 0) {
                        int brickX = j * wallGenerator.brickWidth + 80;
                        int brickY = i * wallGenerator.brickHeight + 50;
                        int brickWidth = wallGenerator.brickWidth;
                        int brickHeight = wallGenerator.brickHeight;

                        Rectangle rect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = ball.getRectangle();
                        Rectangle brickRect = rect;

                        if (ballRect.intersects(brickRect)) {
                            wallGenerator.setBrickValue(0, i, j);
                            score += 5;

                            // Detect condition when ball hits bricks by the border
                            if (ball.ballPosX + 19 <= brickRect.x || ball.ballPosX + 1 >= brickRect.x + brickRect.width) {
                                ball.ballDirX = -ball.ballDirX;
                            }
                            else {
                                ball.ballDirY = -ball.ballDirY;
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

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            play = true;
            slider.moveRight();
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            play = true;
            slider.moveLeft();
        }

        if (!play && e.getKeyCode() == KeyEvent.VK_ENTER) {
            initialize();
            play = true;
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
