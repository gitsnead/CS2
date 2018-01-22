import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner input = new Scanner(System.in);
        UserInterface ui = new UserInterface(input);
        ui.start();
    }
}
