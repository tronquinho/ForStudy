class A {
  private A(){ }
  //A(){ }
}
class B extends A {
  private B() { }
  //B() { }
  void play() { }
  public static void main(String[] args) {
    B b = new B();
    b.play();
  }
}