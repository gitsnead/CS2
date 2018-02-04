
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        Scanner reader = new Scanner(System.in);
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");

        Menu menu = new Menu();
        loop:
        while (true) {
            System.out.println("");
            System.out.print("command: ");
            char menuItem = reader.nextLine().charAt(0);
            switch (menuItem) {
                case '1':
                    menu.addNumber(reader);
                    break;
                case '2':
                    menu.searchPerson(reader);
                    break;
                case '3':
                    menu.searchNumber(reader);
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                case 'x':
                    break loop;
            }
        }
    }
}
