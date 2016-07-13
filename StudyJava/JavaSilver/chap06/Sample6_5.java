class Super {
  int num;
  public void methodA() { num += 100; }
  public void print() {System.out.print("num val : " + num);}
}
class Sub extends Super {
  public void methodA() { num += 500; }
  public void methodB(int num) {
    methodA(); //Call line 7
    print(); //Call Super Class Method
    super.methodA(); //Call line 3
    print(); //Call Super Class Method
  }
}
class Sample6_5 {
  public static void main(String[] args) {
    Sub s = new Sub();
    s.methodB(0);
  }
}