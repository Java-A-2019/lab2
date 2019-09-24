public class lab2_2 {
  public static void main(String[] argv) {
    System.out.print("请输入黑方或者白方：（black | white）");
    Scanner scanner = new Scanner(System.in);
    String player = scanner.nextLine();
    boolean uselessBool = false;
    uselessBool = player.equals("black") && print("我是黑方");
    uselessBool = player.equals("black") || print("我不是黑方");
    uselessBool = player.equals("white") && print("我是白方");
    uselessBool = player.equals("white") || print("我不是白方");
  }

  public static boolean print(String sentence) {
    System.out.println(sentence);
    return true;
  }
}