package arr.barn;

public class HorseBarn {
    Horse[] space;

    public HorseBarn(int spaces) {
        space = new Horse[spaces];
    }

    public int findHorseSpace (Horse horse) {
        for (int i = 0; i < space.length; i++) {
            if (space[i] != null && space[i].equals(horse))
                return i;
        }
        return -1;
    }

    public int addHorseToBarn(Horse horse) {
        int num = findHorseSpace(horse);
        if (num != -1) {
            for (int i = 0; i < space.length; i++) {
                if (space[i] == null) {
                    space[i] = horse;
                    return i;
                }
            }
        }
        return -1;
    }

    public int barnCapacity() {
        int capacity = 0;

        for (int i = 0; i < space.length; i++) {
            if (space[i] == null)   capacity++;
        }

        return capacity;
    }

    public int consolidate() {
        // Implementation pending
        return barnCapacity();
    }

}
