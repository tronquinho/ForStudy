interface MyInter1 {
  double methodA(int num);
  default void methodB() { System.out.println("methodB()"); }
}