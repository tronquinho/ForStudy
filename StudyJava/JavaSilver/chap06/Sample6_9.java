abstract class X {
  protected abstract void methodA();
}
abstract class Y extends X { }
class Z extends Y {
  protected void methodA() { }
  //public void methodA() { }
  //void methodA() { }
}