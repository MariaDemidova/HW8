package demidova.ma.runnersJampers;

import demidova.ma.obstracle.Obstacle;

public class Robot implements RunnerAndJumper {
    private int maxLengthToRun;
    private int maxHeightToJump;
    private String name;

    public Robot(int maxLengthToRun, int maxHeightToJump, String name) {
        this.name = name;
        this.maxLengthToRun = maxLengthToRun;
        this.maxHeightToJump = maxHeightToJump;
    }

    @Override
    public void run(Obstacle track) {
        if(track.getValue() < maxLengthToRun) System.out.printf("Робот %s успешно пробежал дистанцию в %d метров%n", name, track.getValue());
        else System.out.printf("Робот %s не смог пробежать дистанцию в %d метров%n", name, track.getValue());
    }

    @Override
    public void jump(Obstacle wall) {
        if(wall.getValue() < maxHeightToJump) System.out.printf("Робот %s успешно перепрыгнул стену высотой %d метров%n", name, wall.getValue());
        else System.out.printf("Робот %s не смог перепрыгнуть стену высотой %d метров%n", name, wall.getValue());
    }
}