
public class Main {

    public static void main(String[] args) {
        System.out.println("You do not have coins!");
        ManageState state = new ManageState();
        Options options = new Options();
        while (state.getState() != State.exit) {
            options.chooseOption(state);
            System.out.println("State: " + state.getState());
            // if state gameOver than sout
        }
    }
}
