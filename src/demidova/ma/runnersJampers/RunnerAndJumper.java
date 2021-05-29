package demidova.ma.runnersJampers;

import demidova.ma.obstracle.Obstacle;

public interface RunnerAndJumper {
    void run(Obstacle track);
    void jump(Obstacle wall);
}
