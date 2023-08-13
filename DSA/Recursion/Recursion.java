package Recursion;

public class Recursion {

  // Print Name N times
  public static void printName(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.println("Shivam");
    printName(i + 1, n);
  }

  // Print Linearly from 1 to N
  public static void printLinearly(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.println(i);
    printLinearly(i + 1, n);
  }

  // Print from N to 1
  public static void printLinearlyOpp(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    printLinearlyOpp(n - 1);
  }

  // Print Linearly from 1 to N (by backtracking)
  public static void printLinearlyBack(int i, int n) {
    if (i < 1) {
      return;
    }
    printLinearlyBack(i - 1, n);
    System.out.println(i);
  }

  // Print from N to 1 (by backtracking)
  public static void printLinearlyOppBack(int i, int n) {
    if (i > n) {
      return;
    }
    printLinearlyOppBack(i + 1, n);
    System.out.println(i);
  }

  // Sum of first N Numbers (Parameterised Way)
  public static void firstNSumParameterised(int n, int sum) {
    if (n < 1) {
      System.out.println(sum);
      return;
    }
    firstNSumParameterised(n - 1, sum + n);
  }

  // Sum of first N Numbers (Functional Way)
  public static int firstNSumFunctional(int n) {
    if (n == 0) {
      return 0;
    }
    return n + firstNSumFunctional(n - 1);
  }

  // Factorial of N Numbers
  public static int fact(int n) {
    if (n == 1) {
      return 1;
    }
    return n * fact(n - 1);
  }

  public static void main(String[] args) {
    int n = 5;

    // printName(1, n);

    // printLinearly(1, n);

    // printLinearlyOpp(n);

    // printLinearlyBack(n, n);

    // printLinearlyOppBack(1, n);

    // firstNSumParameterised(n, 0);

    // System.out.println(firstNSumFunctional(n));

    System.out.println(fact(n));

  }

}
