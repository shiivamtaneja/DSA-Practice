package JavaConcepts.Package1;

class C1 {
  public int a = 5;
  protected int b = 2;
  int c = 1;
  private int d = 3;

  public void method() {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}

public class Parent {
  public static void main(String[] args) {
    C1 c = new C1();
    
    // Within class
      c.method();

    // Within Package
      System.out.println(c.a);
      System.out.println(c.b);
      System.out.println(c.c);

      // D ko access nahi kr sakte cause woh private hai - 
      // mtlb ki woh sirif apni class mein access ho sakta hai bahar kahi bhi nahi
      System.out.println(c.d); 
  }
}
