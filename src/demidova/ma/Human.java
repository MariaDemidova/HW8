package demidova.ma;

public class Human implements RunnerAndJumper {
    private int maxLengthToRun;
    private int maxHeightToJump;
    private String name;

    public Human(int maxLengthToRun, int maxHeightToJump, String name) {
        this.name = name;
        this.maxLengthToRun = maxLengthToRun;
        this.maxHeightToJump = maxHeightToJump;
    }

    @Override
    public void run(Obstacle track) {
        if(track.getValue() < maxLengthToRun) System.out.printf("Человек %s успешно пробежал дистанцию в %d метров%n", name, track.getValue());
        else System.out.printf("Человек %s не смог пробежать дистанцию в %d метров%n", name, track.getValue());
    }

    @Override
    public void jump(Obstacle wall) {
        if(wall.getValue() < maxHeightToJump) System.out.printf("Человек %s успешно перепрыгнул стену высотой %d метров%n", name, wall.getValue());
        else System.out.printf("Человек %s не смог перепрыгнуть стену высотой %d метров%n", name, wall.getValue());
    }
}
