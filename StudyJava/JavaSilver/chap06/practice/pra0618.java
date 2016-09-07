interface Pue { void method(); }
class Doe implements Pue {
  public void method(){ }
}
class Hau extends Doe {
  public void method() { }
}
class Wia extends Doe {
  public void method() { }
}  
public class pra0618 {
  public static void main(String[] args) {
    Pue p1 = new Doe();
    Hau h2 = new Doe();
    Wia w2 = (Wia)new Doe(); 
    Pua p2 = new Hau();
    Doe d1 = new Hau();
    Wia w1 = new Hau();
    Hau h1 = new Wia();
  }
}
