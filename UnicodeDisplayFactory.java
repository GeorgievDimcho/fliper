
public class UnicodeDisplayFactory implements DisplayFactory {

    @Override
    public Display createDisplay() {
        return new ConsoleDisplay(new UnicodeDisplayFormatter());
    }
}
