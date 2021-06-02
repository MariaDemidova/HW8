package demidova;

import demidova.race.Obstacle;
import demidova.race.Track;
import demidova.race.Wall;
import demidova.runnersJampers.RunnerAndJumper;

public class Judge {

    public static void sayResult(RunnerAndJumper runnerAndJumper, Obstacle track) {
        if(isSuccess(runnerAndJumper, track)) System.out.printf("%s успешно преодолел препятствие.\n", runnerAndJumper.getName());
        else System.out.printf("%s не осилил препятствие.\n", runnerAndJumper.getName());
    }

    private static boolean isSuccess(RunnerAndJumper runnerAndJumper, Obstacle obstacle) {
        if (obstacle instanceof Wall && obstacle.getValue() < runnerAndJumper.getMaxHeightToJump())
            return true;
        else if(obstacle instanceof Track && obstacle.getValue() < runnerAndJumper.getMaxLengthToRun())
            return true;
        else return false;
    }
}
