//public and private
class Employee {
  //instance private
  private int id;
  
  //public constructor
  public Employee(int i) { id = i; }
  
  //public method
  public int getId() { return id; }
}

public class Sample5_10 {
  public static void main(String[] args) {
    Employee emp = new Employee(100);
    
    //access NG
    //System.out.println("access for private instance : " + emp.id);
    
    //access OK
    System.out.println("access for public method : " + emp.getId()) ;
  }
}