import java.util.Deque;   // ←忘れがちなので注意．

public class RatioCalc extends OOGCalc<RatioCalc.Rat> {
    // 後のTreeCalcのために，static なインナークラスにしておくと，
    // RatioCalcのインスタンスを作らなくてもRatのインスタンスを作れる．
    // (名前がぶつからないこと以外は，RatioCalcの外にRatクラスを定義するのとほぼ同じ．)
    static class Rat implements Numeric<Rat> {
        Ratio ratio;
        Rat(int i) { ratio = new Ratio(i, 1); }
        Rat(Ratio r) { ratio = r; }
        public Rat add(Rat r) { return new Rat(ratio.add(r.ratio)); }
        public Rat subtract(Rat r){return new Rat(ratio.subtract(r.ratio));}
        public Rat multiply(Rat r){return new Rat(ratio.multiply(r.ratio));}
        public Rat divide(Rat r){return new Rat(ratio.divide(r.ratio));}
        public String toString() { return ratio.toString(); }
    }
    protected Rat fromInt(int v) {
        return new Rat(v);
    }
    class NoOp extends Op {
        public String opName(){ return "noop"; }
        public void exec(Deque<Rat> stack){}
    }
    String[][] alias = {{"Tasu", "+"}, {"Hiku", "-"}, {"Kakeru", "*"}, {"Waru", "/"},
    {"Kara", "noop"}, {"To", "noop"}, {"Wo", "noop"}, {"De", "noop"}};
    
    RatioCalc() {
        for(String[] pair : alias){
        ops.put("noop", new NoOp());
        ops.put(pair[0], ops.get(pair[1]));
        }
    }
    public static void main(String[] args) {
        new RatioCalc().run();
    }
}