package demidova.ma;

public class Main {

    public static void main(String[] args) {
        RunAndJump[] runAndJumps = {new Cat(500, 2, "Пушок"),
                new Human(1000, 1, "Василий"),
                new Robot(10000, 4, "Боевая машина")};

        Obstacle[] obstacle = {new Track(100), new Wall(1),
                new Track(300), new Wall(2),
                new Track(2000), new Wall(3)};

        for (int i = 0; i < runAndJumps.length; i++) {
            for (int j = 0; j < obstacle.length; j++) {
                if (obstacle[j] instanceof Track) runAndJumps[i].run(obstacle[j]);

                if (obstacle[j] instanceof Wall) runAndJumps[i].jump(obstacle[j]);
            }
            System.out.println();
        }
    }
}
