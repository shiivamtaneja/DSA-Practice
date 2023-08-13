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

  /*
   * Reverse an array - two pointers
   * 
   *      [1, 2, 3, 4]
   *       |        |
   *       V        V
   *       l        r
  */
  public static void reverseArrayTwoPtr(int[] arr, int l, int r) {
    if (l >= r)
      return;
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    reverseArrayTwoPtr(arr, l + 1, r - 1);
  }

  /*
   * Reverse an array - one pointers
   * 
   *      [1, 2, 3, 4]
   *       |        |
   *       V        V
   *       l     n - i - 1
  */
  public static void reverseArrayOnePtr(int[] arr, int i) {
    if (i >= arr.length / 2)
      return;
    int temp = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = temp;
    reverseArrayOnePtr(arr, i + 1);
  }

  public static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Check if string is Palindrome
  public static boolean checkPalindrome(String s, int i) {
    if(i >= s.length() / 2) {
      return true;
    } 
    if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
      return false;
    }
    return checkPalindrome(s, i + 1);
  }

  public static void main(String[] args) {
    // int n = 5;

    // printName(1, n);

    // printLinearly(1, n);

    // printLinearlyOpp(n);

    // printLinearlyBack(n, n);

    // printLinearlyOppBack(1, n);

    // firstNSumParameterised(n, 0);

    // System.out.println(firstNSumFunctional(n));

    // System.out.println(fact(n));

    // int[] arr = { 1, 2, 3, 4 };

    // printArray(arr);
    // reverseArrayTwoPtr(arr, 0, arr.length - 1);
    // printArray(arr);

    // printArray(arr);
    // reverseArrayOnePtr(arr, 0);
    // printArray(arr);
    
    String s = "MADAM";
    System.out.println(checkPalindrome(s, 0));
  }

}
