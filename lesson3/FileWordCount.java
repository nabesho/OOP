import java.io.*;
import java.util.*;

class FileWordCount {
  
    static Scanner fileScanner(String fileName) {
        Scanner value = null;
        try {
            value = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println("file" +  fileName + "none");
            System.exit(1);
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner input = fileScanner(args[0]);
        int count = 0;
        while (input.hasNext()) {
            input.next();  
            count++;
        }
        System.out.println (count + " words.");
    }
}