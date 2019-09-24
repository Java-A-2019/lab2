public class lab2_bonus {
  public static void main(String[] argv) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    String description = "输入的数是偶数";
    if (isOdd(number)) {
      description = "输入的数是奇数";
    }
    System.out.println(description);
  }

  public static boolean isOdd(int num) {
    // Writer your code here
    return false;
  }
}