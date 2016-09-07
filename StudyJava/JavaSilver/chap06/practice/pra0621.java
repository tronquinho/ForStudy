class Animal {
  void saySomething() {
    System.out.print(" Gurrr!");
  }
}
public class pra0621 extends Animal {
  protected void saySomething() {
    System.out.print(" Moo!");
  }
  public static void main(String[] args) {
    System.out.print(" MooYa!");
    Animal[] animals = {new Animal(), new pra0621()};
    for(Animal a : animals) {
      a.saySomething();
    }
  }
}