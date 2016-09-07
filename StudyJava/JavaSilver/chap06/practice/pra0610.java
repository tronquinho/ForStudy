class SuperClass {
  SuperClass() { }
  SuperClass(int i) {
    System.out.println("The value of i is " + i);
  }
}
class SubClass extends SuperClass {
  SubClass(int j) {
    //1
    super(j);
    //2
    System.out.println("The value of j is " + j);    
  }
}
public class pra0610 {
  public static void main(String[] args) {
    SubClass sub = new SubClass(5);
  }
}