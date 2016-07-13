import java.util.ArrayList;

class Sample2_6 {
  public static void main(String[] args) {
    String[] array;
    array = new String[1];
    array[0] = ”田中”;
    String name = array[0];
    System.out.println(name + ":" + array.length);
    
    ArrayList<String> array;
    array = new ArrayList<String>(3);
    array.add("田中");
    String name = array.get(0);
    System.out.println = (name + "+" array.siza())
  }
}