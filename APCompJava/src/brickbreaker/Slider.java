package brickbreaker;

import java.awt.*;

public class Slider {

    // Starting position of the slider.
    public int playerX;

    private int playerY;

    private int sliderWidth;

    public int sliderHeight;

    public Slider() {
        initialize();
    }

    public void initialize() {
        playerX = 310;
        playerY = BrickBreakerGame.frameHeight - 50;
        sliderHeight = 8;
        sliderWidth = 100;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(playerX, playerY, sliderWidth, sliderHeight);
    }

    /**
     * Move slider right by 20px.
     */
    public void moveRight() {
        if (playerX >= (Gameplay.WIDTH - sliderWidth)) {
            playerX = Gameplay.WIDTH - sliderWidth;
        }
        else {
            playerX += 20;
        }
    }

    /**
     * Move slider right by 20px.
     */
    public void moveLeft() {
        if (playerX < 10) {
            playerX = Gameplay.MARGIN;
        }
        else {
            playerX -= 20;
        }
    }

    public Rectangle getRectangle() {
        return new Rectangle(playerX, playerY, sliderWidth, sliderHeight);
    }
}
