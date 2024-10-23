
public class ConsoleDisplay implements Display {

    private final DisplayFormatter formatter;

    public ConsoleDisplay(DisplayFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void display(String message) {
        System.out.println(formatter.formatDisplay(message));
    }
}
