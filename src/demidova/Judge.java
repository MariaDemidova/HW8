package demidova;

import demidova.race.Obstacle;
import demidova.race.Track;
import demidova.race.Wall;
import demidova.runnersJampers.RunnerAndJumper;

public class Judge {
    public static void isSuccessRun(RunnerAndJumper runner, Obstacle track) {
        if(track.getValue() < runner.getMaxLengthToRun()) System.out.printf("%s успешно пробежал дистанцию в %d метров%n", runner.getName(), track.getValue());
        else System.out.printf("%s не смог пробежать дистанцию в %d метров%n", runner.getName(), track.getValue());
    }

    public static void isSuccessJump(RunnerAndJumper jumper, Obstacle wall) {
        if(wall.getValue() < jumper.getMaxHeightToJump()) System.out.printf("%s успешно перепрыгнул стену в %d метров%n", jumper.getName(), wall.getValue());
        else System.out.printf("%s не смог перепрыгнуть стену в %d метров%n", jumper.getName(), wall.getValue());
    }


}
