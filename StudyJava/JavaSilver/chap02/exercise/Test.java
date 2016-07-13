import java.util.*;
public class Test{
  public static void main(String[] args) {
    Integer i1 = new Integer(1);
    Integer i2 = new Integer(2);
    List<Integer> list = new ArrayList<Integer>();
    //ArrayList list = new ArrayList();
    list.add(i1); list.add(i2);
    System.out.println(list);
  }
}