package demidova.ma.runnersJampers;

import demidova.ma.race.Obstacle;

public interface RunnerAndJumper {
    void run(Obstacle track);
    void jump(Obstacle wall);
}
