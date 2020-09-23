package brickbreaker;

import java.awt.*;

public class Ball {

    // Current position of the ball.
    public int ballPosX;
    public int ballPosY;

    // Current direction of the ball.
    public int ballDirX;
    public int ballDirY;

    public int ballWidth;
    public int ballHeight;

    public Ball() {
        initialize();
    }

    public void initialize() {
        ballPosX = 120;
        ballPosY = 350;
        ballDirX = -1;
        ballDirY = -2;
        ballWidth = 20;
        ballHeight = 20;
    }

    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(ballPosX, ballPosY, ballWidth, ballHeight);
    }

    public void move() {
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
        if (ballPosX > (Gameplay.WIDTH - ballWidth)) {
            ballDirX = -ballDirX;
        }
    }

    public Rectangle getRectangle() {
        return new Rectangle(ballPosX, ballPosY, ballWidth, ballHeight);
    }
}
