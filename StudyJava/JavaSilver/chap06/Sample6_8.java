abstract class Super {
  protected abstract void methodA();
  public void methodB(){}
}
class Sub extends Super {
  protected void methodA(){ }
  //public void methodA(){ }
  public void methodB(){ }
}