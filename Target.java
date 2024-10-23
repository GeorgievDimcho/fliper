
public class Target implements FlipperElement {

    private boolean elevated;
    private boolean ledOn;
    private int passes;
    private int points;
    // Add more fields for other properties

    public void setElevated(boolean elevated) {
        this.elevated = elevated;
    }

    public boolean isElevated() {
        return elevated;
    }

    public void setLedOn(boolean ledOn) {
        this.ledOn = ledOn;
    }

    public boolean isLedOn() {
        return ledOn;
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
        visitor.visitTarget(this);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}