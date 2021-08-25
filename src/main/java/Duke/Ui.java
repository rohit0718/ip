package Duke;

public class Ui {
    private final String BORDER = "---------------------------------------------------";
    private final String GREETING = "Hello! I'm Duke, what can I do for you?";
    private final String FAREWELL = "Bye. Hope to see you again soon!";

    private void printDuke(String str) {
        System.out.printf(String.format("%s\n%s\n%s\n", BORDER, str, BORDER)
                .replaceAll("(?m)^", "\t"));
    }

    /**
     * Prints a Welcome message to the screen.
     *
     */
    public void showWelcome() {
        printDuke(GREETING);
    }

    /**
     * Prints a Farewell message to the screen.
     *
     */
    public void showFarewell() {
        printDuke(FAREWELL);
    }

    /**
     * Prints a message to the screen with border.
     *
     * @param message message to print to the screen
     */
    public void showMessage(String message) {
        printDuke(message);
    }
}
