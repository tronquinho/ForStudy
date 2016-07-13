public class ex5_11 {
  public static void main(String[] args) {
    ex5_11 ojb1 = new ex5_11();
    ex5_11 ojb2 = new ex5_11();
    System.out.print(ojb1 == ojb2);
    ojb2 = operate(ojb1,ojb2);
    System.out.print(" " + (ojb1 == ojb2));
  }
  
  static ex5_11 operate(ex5_11 ojb1, ex5_11 ojb2) {
    ex5_11 ojb3 = ojb1;
    ojb1 = ojb2;
    return ojb3;
  }
}