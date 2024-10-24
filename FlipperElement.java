
public class FlipperElement implements FlipperInterface {

    public int points;

    @Override
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hit(FlipperElement element, Options options) {
        options.setScore(options.getScore() + element.getPoints());
        System.out.println("the element " + element + " was hit. \nThis brings " + element.getPoints() + " extra points.");
    }

    @Override
    public void execute(FlipperElement element, Options options) {
        this.hit(element, options);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
