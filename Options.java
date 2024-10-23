
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
                    state.setState(State.ready);
                    System.out.println("Thank you! You are ready to go! Press p to start the game.");
                    System.out.println("Your current score count is " + coins + " .");
                }
                case "b" -> {
                    ball.setCount(ball.getCount()-1);
                }
                case "e" -> {
                    if (state.getState() != State.exit) {
                        state.setState(State.exit);
                        scanner.close();
                    }
                    System.out.println("It was a good game! Bye.");
                }
                case "p" -> {
                    if (getCoins() > 0) {
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
        if (getCoins() == 0) {
            state.setState(State.noCredit);
        }
        if(ball.getCount() == 0) {
            state.setState(State.gameOver);
        }
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
