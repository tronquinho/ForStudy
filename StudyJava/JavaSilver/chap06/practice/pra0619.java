class SuperClass {
  SuperClass() {
    System.out.print(" I was Super Class." );
  }
  public void aMethod(int i) {
    System.out.print(" The value of i is " + i);
  }
}

class SubClass extends SuperClass {
  public void aMethod(int j) {
    System.out.print(" The value of j is " + j);
  }
}

public class pra0619 {
  public static void main(String[] args) {
    SuperClass s = new SubClass();
    s.aMethod(5);
  }
}