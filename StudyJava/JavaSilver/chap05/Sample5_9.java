//Initializer
class Foo {
  static {
    System.out.println("Foo Class:static initializer");
  }
  Foo() {
    System.out.println("Foo Class:Constructor");    
  }
}

public class Sample5_9 {
  static {
    System.out.println("Sample5_9 Class:static initializer");    
  }
  public static void main(String[] args) {
    System.out.println("Sample5_9 Class:main() method");    
    Foo f = new Foo();
  }
}