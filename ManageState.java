
public class ManageState {

    // Der Flipper befindet sich anfangs im NoCredit-Zustand.
    public State state = State.noCredit;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
