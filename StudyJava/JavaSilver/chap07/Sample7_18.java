import java.util.*;
import java.util.function.*;

public class Sample7_18 {
  public static void main(String[] args) {
    List<Integer> data = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    
    /*
    data.removeIf(nwe Predicate<Integer>() {
      public boolean test(Integer i) {
        if(i % 2 != 0) {
          return true;
        }else{
          return false;
        }
      }
    } );
    */
    data.removeif( (Integer i) -> { return i % 2 != 0; } );
    //data.removeif(i -> i % 2 != 0);
    System.out.println(data);
  }
}