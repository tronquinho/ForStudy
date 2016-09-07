abstract class MyClass {
  abstract void x();
}
class Y extends MyClass {
  void x() { }
}
abstract class Z extends MyClass {
  abstract void z();
}
/*
class Y extends MyClass {
  void x();
}
class Y extends MyClass {
  void x() { }
  void y();
}
class Y implements MyClass {
  void x() { }
}
abstract class Y implements MyClass {
  void x() { }
}
*/