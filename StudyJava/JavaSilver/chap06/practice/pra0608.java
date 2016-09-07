class MySuperClass {
  private int x;
  MySuperClass(int i){
    x=i;
    System.out.println("mySuperClass: "+ x);
  }
  //MySuperClass(){ }
}
public class pra0608 extends MySuperClass {
  public static void main(String[] args){
    new pra0608();
    new pra0608(3);
  }
  pra0608(int i){
    super(i);
  }
  pra0608(){
    this(5);
    System.out.println("Default");
  }
}