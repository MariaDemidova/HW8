package demidova;

import demidova.race.Obstacle;
import demidova.runnersJampers.RunnerAndJumper;

public class Judge {
    public static void isSuccessRun(RunnerAndJumper runner, Obstacle track) {
        if(track.getValue() < runner.getMaxLengthToRun()) System.out.printf("%s успешно пробежал дистанцию.\n", runner.getName());
        else System.out.printf("%s не смог пробежать дистанцию.\n", runner.getName());
    }

    public static void isSuccessJump(RunnerAndJumper jumper, Obstacle wall) {
        if(wall.getValue() < jumper.getMaxHeightToJump()) System.out.printf("%s успешно перепрыгнул стену.\n", jumper.getName());
        else System.out.printf("%s не смог перепрыгнуть стену.\n", jumper.getName());
    }


}
