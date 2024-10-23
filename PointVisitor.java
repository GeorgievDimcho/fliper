public class PointVisitor implements Visitor {
    private final int level;

    public PointVisitor(int level) {
        this.level = level;
    }

    @Override
    public void visitRamp(Ramp ramp) {
        ramp.setPoints(ramp.getPasses() * level);
    }

    @Override
    public void visitTarget(Target target) {
        target.setPoints(target.getPasses() * level);
    }

    // Add more methods for other flipper elements
}