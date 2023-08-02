package JavaConcepts.Package1;

import JavaConcepts.Package1.C1;

// Outside Package by Subclass
class ChildExtends extends C1 {
  void method1() {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d); // d is private
  }
}

public class Child {
  public static void main(String[] args) {
    ChildExtends c = new ChildExtends();
    c.method1();
  }
}

