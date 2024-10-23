
public class Ramp implements FlipperElement {

    private boolean opened;
    private int passes;
    private int points;
    // Add more fields for other properties

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }

    public int getPasses() {
        return passes;
    }

    // Add more methods for other properties
    @Override
    public void accept(Visitor visitor) {
        visitor.visitRamp(this);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}