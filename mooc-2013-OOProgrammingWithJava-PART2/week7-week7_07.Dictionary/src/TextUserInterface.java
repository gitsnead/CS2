/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ryanw
 */
public class TextUserInterface {

    private Dictionary words;
    private Scanner reader;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.words = dictionary;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quit the text user interface");
        while (true) {
            System.out.println("");
            System.out.print("Statement: ");
            String command = this.reader.nextLine().trim();
            if (command.equalsIgnoreCase("quit")) {
                break;
            } else if (command.equalsIgnoreCase("add")) {
                add(this.reader);
            } else if (command.equalsIgnoreCase("translate")) {
                translate(this.reader);
            } else {
                System.out.println("Unknown statement");
            }
        }
        System.out.println("Cheers!");
    }

    public void add(Scanner reader) {
        System.out.print("In Finnish: ");
        String keyFinnish = this.reader.nextLine();
        System.out.print("Translation: ");
        String mapEnglish = this.reader.nextLine();
        this.words.add(keyFinnish, mapEnglish);
    }

    public void translate(Scanner reader) {
        System.out.print("Give a word: ");
        String keyFinnish = this.reader.nextLine();
        System.out.println("Translation: " + this.words.translate(keyFinnish));

    }
}
