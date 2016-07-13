import java.util.ArrayList;

class Sample2_9{
  public static void main(String[] args) {
    ArrayList array = new ArrayList();
    array.add(10);
    //int num = array.get(0); //Compile Error
    int num = (Integer)array.get(0); //using cast
  }
}