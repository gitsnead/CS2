/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class WordInspection {

    private final File wordFile;
    private final ArrayList<String> wordList;

    public WordInspection(File file) {
        this.wordFile = file;
        this.wordList = new ArrayList<String>();
        Scanner reader;
        try {
            reader = new Scanner(this.wordFile, "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println("We couldn't read the file. Error: " + e.getMessage());
            return; // we exit the method
        }
        while (reader.hasNext()) {
            this.wordList.add(reader.nextLine().toLowerCase());
        }
    }

    public int wordCount() {
        return this.wordList.size();
    }

    public List<String> wordsContainingZ() {
        ArrayList<String> wordz = new ArrayList<String>();
        for (String word : this.wordList) {
            if (word.contains("z")) {
                wordz.add(word);
            }
        }
        return wordz;
    }

    public List<String> wordsEndingInL() {
        ArrayList<String> wordl = new ArrayList<String>();
        for (String word : this.wordList) {
            if (word.length() > 0 && word.charAt(word.length() - 1) == 'l') {
                wordl.add(word);
            }
        }
        return wordl;
    }

    private static String reverse(String text) {
        // write your code here
        // note that method does not print anything, it RETURNS the reversed string
        int index = text.length() - 1;
        String reverseText = "";
        while (index >= 0) {
            reverseText = reverseText + text.substring(index, index + 1);
            index -= 1;
        }
        return reverseText;
    }

    public List<String> palindromes() {
        ArrayList<String> pals = new ArrayList<String>();
        for (String word : this.wordList) {
            if (word.length() > 0 && word.equals(this.reverse(word))) {
                pals.add(word);
            }
        }
        return pals;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        ArrayList<String> vowelers = new ArrayList<String>();
        for(String word : this.wordList) {
            if(word.contains("a")
            && word.contains("e")
            && word.contains("i")
            && word.contains("o")
            && word.contains("u")
            && word.contains("y")
            && word.contains("ä")
            && word.contains("ö")) {
                vowelers.add(word);
            }
        }
        return vowelers;
    }
}
