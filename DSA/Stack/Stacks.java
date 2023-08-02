package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Implement using Linked List
// public class Stacks {

//   static class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//       this.data = data;
//       next = null;
//     }
//   }

//   static class Stack {
//     public static Node head;

//     public static boolean isEmpty() {
//       if (head == null)
//         return true;
//       else
//         return false;
//     }

//     public static void push(int data) {
//       Node newNode = new Node(data);
//       if (isEmpty()) {
//         head = newNode;
//         return;
//       }
//       newNode.next = head;
//       head = newNode;
//     }

//     public static int pop() {
//       if (isEmpty())
//         return -1;
//       int top = head.data;
//       head.next = head;
//       return top;
//     }

//     public static int peek() {
//       if (isEmpty())
//         return -1;

//       return head.data;
//     }
//   }

//   public static void main(String[] args) {
//     Stack s = new Stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     while (!s.isEmpty()) {
//       System.out.println(s.peek());
//       s.pop();
//     }
//   }

// }

// Implemet using ArrayList
// public class Stacks {

//   class Stack {
//     static ArrayList<Integer> list = new ArrayList<>();

//     public static boolean isEmpty() {
//       if (list.size() == 0)
//         return true;
//       else
//         return false;
//     }

//     public static void push(int data) {
//       list.add(data);
//     }

//     public static int pop() {
//       if (isEmpty())
//         return -1;
//       int top = list.get(list.size() - 1);
//       list.remove(top);
//       return top;
//     }

//     public static int peek() {
//       if (isEmpty())
//         return -1;

//       return list.get(list.size() - 1);
//     }

//   }

//   public static void main(String[] args) {
//     Stack s = new Stack();

//     s.push(1);
//     s.push(2);
//     s.push(3);
//     s.push(4);

//     while(!s.isEmpty()) {
//       System.out.println(s.peek());
//       s.pop();
//     }
//   }

// }

public class Stacks {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();

    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }

  }
}