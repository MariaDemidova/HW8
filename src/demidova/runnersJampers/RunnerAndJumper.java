package demidova.runnersJampers;

import demidova.race.Obstacle;

public interface RunnerAndJumper {
    void run(Obstacle track);
    void jump(Obstacle wall);
    String getName();
    int getMaxLengthToRun();
    int getMaxHeightToJump();
}
