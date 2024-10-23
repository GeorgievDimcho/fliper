
public class AsciiDisplayFactory implements DisplayFactory {

    @Override
    public Display createDisplay() {
        return new ConsoleDisplay(new AsciiDisplayFormatter());
    }
}
