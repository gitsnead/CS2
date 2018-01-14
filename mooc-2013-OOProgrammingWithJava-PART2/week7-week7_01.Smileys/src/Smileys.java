
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        printWithSmileys("Mikael");
        printWithSmileys("Arto");
    }

    private static void printWithSmileys(String characterString) {
        String whitespace = "";
        if (characterString.length() % 2 == 1) {
            whitespace = " ";
        }
        printEncapsulate(characterString.length());
        System.out.println(":) " + characterString + whitespace + " :)");
        printEncapsulate(characterString.length());
    }

    private static void printEncapsulate(int length) {
        if (length % 2 == 1) {
            length++;
        }
        for (int i = 0; i <= length+4; i=i+2) {
            System.out.print(":)");
        }
        System.out.println("");
    }
}
