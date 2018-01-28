package wordinspection;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test your code here

//        File file = new File("src/shortList.txt");
        File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        WordInspection wi = new WordInspection(file);
        List<String> list = wi.wordsContainingZ();
        printAll(list);
        System.out.println("---------------------------");
        list = wi.wordsEndingInL();
        printAll(list);
        System.out.println("---------------------------");
        list = wi.palindromes();
        printAll(list);
        System.out.println("---------------------------");
        list = wi.wordsWhichContainAllVowels();
        printAll(list);
    }

    public static void printAll(List<String> list) {
        for (String word : list) {
            System.out.println(word);
        }
    }
}
