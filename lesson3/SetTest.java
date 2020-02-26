import java.util.*;

class SetTest {
  public static void main(String[] args) {
    Set<String> set = new HashSet<String>() ;
    for (int i = 0;i < args.length; i++) {
      set.add(args[i]);
    }
    System.out.println(set.size() + " words.");
  }
}