/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ryanw
 */
public class Printer {
    private String filename;
    
    public Printer(String filename) throws Exception {
        this.filename = filename;
    }
    
    public void printLinesWhichContain(String word) {
        File f = new File(this.filename);
        Scanner reader;
        try {
            reader = new Scanner(f, "UTF-8");
        } catch (Exception e) {
            System.out.println("Unable to load file. Error: " + e.getMessage());
            return;
        }
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            if(word.isEmpty() || line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}
