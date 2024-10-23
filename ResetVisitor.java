public class ResetVisitor implements Visitor {
    @Override
    public void visitRamp(Ramp ramp) {
        ramp.setOpened(false);
        ramp.setPasses(0);
    }

    @Override
    public void visitTarget(Target target) {
        target.setElevated(false);
        target.setLedOn(false);
    }

    // Add more methods for other flipper elements
}