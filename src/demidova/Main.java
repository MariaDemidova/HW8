package demidova;

import demidova.race.Obstacle;
import demidova.race.Track;
import demidova.race.Wall;
import demidova.runnersJampers.Cat;
import demidova.runnersJampers.Human;
import demidova.runnersJampers.Robot;
import demidova.runnersJampers.RunnerAndJumper;

public class Main {

    public static void main(String[] args) {
        RunnerAndJumper[] runnersAndJumpers = {new Cat(500, 2, "Пушок"),
                new Human(1000, 1, "Василий"),
                new Robot(10000, 4, "Боевая машина")};

        Obstacle[] obstacle = {new Track(100), new Wall(1),
                new Track(300), new Wall(2),
                new Track(2000), new Wall(3)};

        for (int i = 0; i < runnersAndJumpers.length; i++) {
            for (int j = 0; j < obstacle.length; j++) {
                if (obstacle[j] instanceof Track) {
                    runnersAndJumpers[i].run(obstacle[j]);
                    Judge.sayResult(runnersAndJumpers[i], obstacle[j]);
                }

                if (obstacle[j] instanceof Wall) {
                    runnersAndJumpers[i].jump(obstacle[j]);
                    Judge.sayResult(runnersAndJumpers[i], obstacle[j]);
                }
            }
            System.out.println();
        }
    }
}
