//Differences between Instance Member and Static Member
class Sample5_6 {
  int instanceVal = 100;
  static int staticVal = 200;
  void methodA() {System.out.println("methodA(): " + instanceVal);}
  static void methodB() {
    System.out.println("methodB(): " + staticVal);
  }
}