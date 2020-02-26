import java.util.Scanner;

class EchoInt {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    System.out.println("入力された整数は:" + i);
  }
} 