public class ex5_9 {
  public void message(int i) {
    public int j = i;
    System.out.println("Value of j: " + j);
  }
  public static void main(String[] args) {
    ex5_9 ma = new ex5_9();
    ma.message(15);
  }
}