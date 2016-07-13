//Call Static method
class Sample5_7 {
  public static void main(String[] args) {
    //System.out.println(Sample5_6.instanceVal); //NG
    System.out.println(Sample5_6.staticVal); //OK
    //Sample5_6.methodA(); //NG
    Sample5_6.methodB(); //OK

    System.out.println("--------------------");
    Sample5_6 obj = new Sample5_6();
    System.out.println(obj.instanceVal); //OK
    System.out.println(obj.staticVal); //OK
    obj.methodA(); //OK
    obj.methodB(); //OK    
  }
}