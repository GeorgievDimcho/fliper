
public class Main {

    public static void main(String[] args) {
        System.out.println("You do not have coins!");
        ManageState state = new ManageState();
        Options options = new Options();
        while (state.getState() != State.exit) {
            options.chooseOption(state, options);
            System.out.println("State: " + state.getState());
            System.out.println("Balls " + options.ball.getCount());
            System.out.println("coins " + options.getCoins());
            System.out.println("score " + options.getScore());
            // if state gameOver than sout
        }
    }
}
