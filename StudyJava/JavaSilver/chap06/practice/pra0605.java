public class pra0605 {
  private String msg;
  public pra0605() { this("Good morning"); }
  public pra0605(String msg) { msg = msg; }
  public String toString(){ return ("msg : " + msg); }
  
  public static void main(String[] args) {
    System.out.println(new pra0605());
  }
}