class Animal {
  public static void saySomething() {
    System.out.print(" Gurrr!");
  }
}
public class pra0620 extends Animal {
  public static void saySomething() {
    System.out.print(" Moo!");
  }
  public static void main(String[] args) {
    Animal[] animals = {new Animal(), new pra0620()};
    for( Animal a : animals) {
      a.saySomething();
    }
    new pra0620().saySomething();
  }
}