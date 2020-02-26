import java.util.*;

public class JCalc extends OOCalc {
  class NoOp extends Op {
    public String opName(){ return "noop"; }
    public void exec(Deque<Integer> stack){}
  }
  String[][] alias = {{"Tasu", "+"}, {"Hiku", "-"}, {"Kakeru", "*"}, {"Waru", "/"},
    {"Kara", "noop"}, {"To", "noop"}, {"Wo", "noop"}, {"De", "noop"}};
  JCalc() {
    ops.put("noop", new NoOp());
    for (String[] pair : alias) {
      ops.put(pair[0], ops.get(pair[1]));
    }
  }
  public static void main(String[] args) {
    new JCalc().run();
  }
}
