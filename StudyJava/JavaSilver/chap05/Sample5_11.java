//difference of basic data type and reference type
class ArgTest {
  void method1(int num) { //recieve basic data type
    num += 10;
    System.out.println(" Def Side " + num);
  }
  void method2(int[] array) { //recieve refference data type
    array[0] += 10;
    System.out.println( "Def Side " + array[0]);
  }
}
class Sample5_11 {
  public static void main(String[] args) {
    int num = 10;
    int[] array = {10,30};
    ArgTest obj = new ArgTest();
    
    obj.method1(num);
    System.out.println( "Call Side " + num);
    
    obj.method2(array);
    System.out.println(" Call Side " + array[0]);
  }
}