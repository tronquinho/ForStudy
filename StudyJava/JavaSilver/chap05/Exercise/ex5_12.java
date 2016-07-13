class Foo1 {
  int x; //local value
  void setX(int x) {this.x = x;} //method
  int getX() {return x;} //method
}

class Foo2 {
  Foo1 f; //local value Foo1
  void setFoo1(Foo1 f) {this.f = f;} //method
  Foo1 getFoo1() {return f;} //method
}

class Test {
  public static void main(String[] args) {
    Foo1 f1 = new Foo1();
    Foo2 f2 = new Foo2();
    int a = 10;
    f1.setX(a);
    f2.setFoo1(f1);
    //f1.setX(100);
    f2.getFoo1().setX(100);
    System.out.println(f2.getFoo1().getX());
  }
}