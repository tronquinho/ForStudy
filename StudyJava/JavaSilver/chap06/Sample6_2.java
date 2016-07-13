class Super {
  public void print(String s) {
    System.out.println("Super print : " + s);
  }
  public void method() { }
}
class Sub extends Super {
  public void print(String s) {
    s = "The literal given me " + s + ".";
    System.out.println("Sub print   : " + s);
  }
  //void method() { }
}
class Sample6_2 {
  public static void main(String[] args) {
    Super s1 = new Super();
    s1.print("Java");
    Sub s2 = new Sub();
    s2.print("Java");
  }
}