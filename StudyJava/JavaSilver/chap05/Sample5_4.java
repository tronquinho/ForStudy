//OverLoad CompileError Example
class Test {
  //BaseLine method
  String myPrint(int a, String b){ return "test"; }
  //Compile OK
  String myPrint(int a, int b){ return "test"; }
  String myPrint(String a, int b){ return "test"; }
  //Compile NG
  void myPrint(int a, String b){}
  String myPrint(int x, String y){ return "test"; }
}