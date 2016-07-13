//Accessing between static and instance
class Sample5_8 {
  int instanceVal; //Value of instanceVal
  static int staticVal; //Value of static
  
  int methodA() { return instanceVal; }
  int methodB() { return staticVal; }
  //static int methodC() { return instanceVal; } //NG
  static int methodD() { return staticVal; }
  static int methodE() {
    Sample5_8 obj = new Sample5_8();
    return obj.instanceVal;
  }
}