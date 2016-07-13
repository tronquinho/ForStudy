class Employee{
  int id;
  void setId(int i){
    id = i;
  }
  int getId(){
    return id;
  }
}
class Sample5_2{
  public static void main(String[] args) {
    //Create Instance For A
    Employee a = new Employee();
    //Set ID
    a.setId(100);
    
    //Create Instance for B
    Employee b = new Employee();
    //Set ID
    b.setId(200);
    
    //Display each ID
    System.out.println("A:" + a.getId());
    System.out.println("B:" + b.getId());
  }
}