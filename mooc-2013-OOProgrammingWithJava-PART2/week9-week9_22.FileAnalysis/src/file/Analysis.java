/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ryanw
 */
public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() {
        Scanner reader;
        try {
            reader = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            System.out.println("We couldn't read the file. Error: " + e.getMessage());
            return -1; // we exit the method
        }
        int lineCount = 0;
        while (reader.hasNext()) {
            reader.nextLine();
            lineCount++;
        }
        reader.close();
        return lineCount;
    }

    public int characters() {
        Scanner reader;
        try {
            reader = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            System.out.println("We couldn't read the file. Error: " + e.getMessage());
            return -1; // we exit the method
        }
        int charCount = 0;
        while (reader.hasNext()) {
            String line = reader.nextLine() + "\n";
            charCount += line.length();
        }
        reader.close();
        return charCount;
    }
}
