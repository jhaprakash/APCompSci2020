package stickgame.oop.player;

import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int pickSticks() {
        Scanner scanner = new Scanner(System.in);
        int sticks = 0;

        while (sticks != 1 && sticks != 2) {
            System.out.println("Do you want to pick 1 or 2 sticks");
            sticks = scanner.nextInt();
            if (sticks != 1 && sticks != 2) {
                System.out.println("You can only pick 1 or two sticks, you picked: " + sticks);
            }
        }

        return sticks;
    }
}
