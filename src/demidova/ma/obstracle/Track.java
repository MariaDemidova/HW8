package demidova.ma.obstracle;

public class Track extends Obstacle {
    private int trackLength;

    public Track(int trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public int getValue() {
        return trackLength;
    }
}
