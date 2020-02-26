import java.io.*;
import java.util.*;

class Spell {
    static Scanner fileScanner(String fileName) {
        Scanner value = null;
        try {
            value = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println("file " +  fileName + " is none");
            System.exit(1);
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner input = fileScanner(args[0]);
        input.useDelimiter("[^a-zA-Z']+");


        Scanner dict = FileWordCount.fileScanner("dict");
        dict.useDelimiter("[^a-zA-Z']+");

        //Set<String> set = new HashSet<String>() ;

        //int count = 0;
        while (dict.hasNext()) {
            while(input.hasNext()){
            if(dict.next().toLowerCase() == input.next().toLowerCase()){
                System.out.println("a");
            }; 
          //  count++;
            }
        }
        //System.out.println (count + " words.");
    }
}