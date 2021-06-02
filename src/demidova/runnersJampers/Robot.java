package demidova.runnersJampers;

import demidova.race.Obstacle;

public class Robot implements RunnerAndJumper {
    private int maxLengthToRun;
    private int maxHeightToJump;
    private String name;

    public Robot(int maxLengthToRun, int maxHeightToJump, String name) {
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
        System.out.printf("Робот %s бежит...", name);
    }

    @Override
    public void jump(Obstacle wall) {
        System.out.printf("Робот %s прыгает...", name);
    }
}
