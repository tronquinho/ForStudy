class MySuperClass {
  public void message() {
    System.out.println("From the Super class!");
  }
}
class MySubClass extends MySuperClass {
  void message() {
    System.out.println("From the Sub class!");
  }
  public static void main(String[] args) {
    MySubClass mysub = new MySubClass();
    mysub.message();
  }
}