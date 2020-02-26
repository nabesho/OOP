import java.util.Scanner;

class EchoLine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    System.out.println("入力された文字列は:" + s);
  }
} 