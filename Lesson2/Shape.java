// ファイルShape.java
public abstract class Shape {
    // 抽象メソッド inside(x, y)
    // (x, y)が図形の内側ならtrueを，そうでなければfalseを返すものとする．
    // ちょうど境界線上は内側とみなす約束とする．
    abstract boolean inside(double x, double y); 

    // draw(x1, x2, xstep,  y1, y2, ystep)
    // x座標: x1からx2までxstep刻み
    // y座標: y1からy2までystep刻み
    // (x, y)が図形の内側なら*を，そうでなければ空白を書く．
    void draw(double x1, double x2, double xstep,
              double y1, double y2, double ystep) {
        for (double y = y2; y >= y1; y -= ystep) {
            for (double x = x1; x <= x2; x += xstep) {
                if (inside(x, y)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
class RectShape extends Shape {
    double left, bottom, width, height;
    RectShape(double left, double bottom, double width, double height) {
        this.left = left;
        this.bottom = bottom;
        this.width = width;
        this.height = height;
    }
    boolean inside(double x, double y) {
        return left <= x && x <= left + width &&
            bottom <= y && y <= bottom + height;
    }
}
class RectTest {
    public static void main(String[] args) {
        RectShape r1 = new RectShape(2.0, 2.0, 5.0, 3.0);
        RectShape r2 = new RectShape(1.0, 1.0, 4.0, 3.5);
        r1.draw(0.0, 7.0, 0.25,
                0.0, 6.0, 0.5);
        System.out.println("------------------------------------------------");
        r2.draw(0.0, 7.0, 0.25,
                0.0, 6.0, 0.5);
    }
}