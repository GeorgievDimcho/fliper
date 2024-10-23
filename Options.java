
import java.util.Scanner;

public class Options {

    public int coins = 0;
    Ball ball = new Ball();

    public void chooseOption(ManageState state) {
        System.out.println("What do you want to do next?");
        System.out.println("Press c to insert a coin");
        System.out.println("Press p to play");
        System.out.println("Press b if a ball was lost");
        System.out.println("Press e to exit");
        try {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "c" -> {
                    setCoins(getCoins() + 1);
                    //ball.setCount(ball.getCount()+3);
                    if (ball.getCount() == 0 && state.getState() != State.playing) {
                        ball.setCount(3);
                    }
                    state.setState(State.ready);
                    System.out.println("Thank you! You are ready to go! Press p to start the game.");
                    System.out.println("Your current coin count is " + coins + " .");
                }
                case "b" -> {
                    if (state.getState() == State.playing) {
                        ball.setCount(ball.getCount() - 1);
                    }
                }
                case "e" -> {
                    if (state.getState() != State.exit) {
                        state.setState(State.exit);
                        scanner.close();
                    }
                    System.out.println("It was a good game! Bye.");
                }
                case "p" -> {
                    if (getCoins() > 0 || ball.getCount() > 0) {
                        setCoins(getCoins() - 1);
                        if (state.getState() != State.playing) {
                            state.setState(State.playing);
                            System.out.println("The game started.");
                        } else {
                            System.out.println("Author 1 : ...");
                        }
                    } else {
                        System.out.println("Please insert a coin first.");
                    }
                }
                default -> {
                    System.out.println("Say again...");
                }
            }
        } catch (java.util.InputMismatchException e) {
        }

        if (ball.getCount() == 0 && state.getState() == State.playing) {
            state.setState(State.gameOver);
        }
        if (state.getState() != State.playing) {
            // if ((coins > 0 || ball.getCount() > 0) && state.getState() == State.gameOver) {
            if ((coins > 0 || ball.getCount() > 0)) {
                state.setState(State.ready);
            } else {
                state.setState(State.noCredit);
            }
        }

    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
