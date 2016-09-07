interface A { public int m1(); }
interface B { void m2(); }

class Test01 implements A,B {
  public int m1() { return 0; }
  public void m2() { }
}

class Test02 extends A,B {
  public int m1() { return 0; }
  public void m2() { }
}

class Test03 implements A,B {
  public int m1() { return 0; }
  void m2() { }
}

class Test04 extends A,B {
  public int m1() { return 0; }
  void m2() { }
}

