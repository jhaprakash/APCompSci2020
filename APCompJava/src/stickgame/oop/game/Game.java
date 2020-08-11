package stickgame.oop.game;

import stickgame.oop.player.Player;

public abstract class Game {
    protected Player first;
    protected Player second;

    public Game(Player first, Player second)
    {
        this.first = first;
        this.second = second;
    }

    public abstract void startGame();

    public abstract void stopGame();

    public abstract void play();
}
