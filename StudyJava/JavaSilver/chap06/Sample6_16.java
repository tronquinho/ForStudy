//Autoboxng and Unnboxing
class Sample6_16 {
  public static void main(String[] args) {
    int i1 = 100;
    Integer obj = i1; //Autoboxing
    int i2 = obj; //Unboxing
    method(i2);
  }
  static void method(Integer obj) {
    int i = obj + 100;
    System.out.println(i);
  }
}