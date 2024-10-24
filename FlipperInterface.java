
public interface FlipperInterface {

    void accept(Visitor visitor);

    void hit(FlipperElement element, Options options);

    void execute(FlipperElement element, Options options);
}
