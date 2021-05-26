package demidova.ma;

public class Wall extends Obstacle {
    private int wallHeight;

    public Wall(int height) {
        this.wallHeight = height;
    }

    @Override
    public int getValue() {
        return wallHeight;
    }
}
