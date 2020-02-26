import java.util.*;

class WordSetCount {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Set<String> set = new HashSet<String>() ;
      int count = 0;
      while (input.hasNext()) {
          //input.next();  // トークン(単語)をひとつ読む．読んだ結果は使わない．
          //count++;
          set.add(input.next());
      }
      System.out.println (set.size() + " words.");
  }
}
