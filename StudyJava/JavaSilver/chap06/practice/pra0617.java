class Foo {
  float foo;
  void x() { }
}
public class pra0617 {
  public static void main(String[] args) {
    Foo foo = new Foo();
    //Foo.foo = 4.0f;
    //foo = 4.0f;
    foo.foo = 4.0;
  }
}