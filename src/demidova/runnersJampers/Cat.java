package demidova.runnersJampers;

import demidova.race.Obstacle;

public class Cat implements RunnerAndJumper {
    private int maxLengthToRun;
    private int maxHeightToJump;
    private String name;

    public Cat(int maxLengthToRun, int maxHeightToJump, String name) {
        this.name = name;
        this.maxLengthToRun = maxLengthToRun;
        this.maxHeightToJump = maxHeightToJump;
    }

    public String getName() {
        return name;
    }

    public int getMaxLengthToRun() {
        return maxLengthToRun;
    }

    public int getMaxHeightToJump() {
        return maxHeightToJump;
    }

    @Override
    public void run(Obstacle track) {
        System.out.printf("Кот %s бежит дистанцию %d метров...", name, track.getValue());
    }

    @Override
    public void jump(Obstacle wall) {
        System.out.printf("Кот %s прыгает через стену %d метров...", name, wall.getValue());
    }
}
