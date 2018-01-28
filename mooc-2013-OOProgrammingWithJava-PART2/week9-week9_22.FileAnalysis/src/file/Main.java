package file;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/testfile.txt");
        Analysis stats = new Analysis(file);
        System.out.println(stats.lines());
        System.out.println(stats.characters());
    }
}
