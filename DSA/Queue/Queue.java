package Queue;

public class Queue {

  // static class ArrayQueue {
  // static int arr[];
  // static int size;

  // static int rear = -1;

  // ArrayQueue(int n) {
  // arr = new int[n];
  // this.size = n;
  // }

  // public static boolean isEmpty() {
  // return rear == -1;
  // }

  // // Add function - enqueue
  // public static void add(int data) {
  // if (rear == size - 1) {
  // System.out.println("Full Queue");
  // return;
  // }

  // rear++;
  // arr[rear] = data;
  // }

  // public static int remove() {
  // if (isEmpty()) {
  // return -1;
  // }

  // int front = arr[0];

  // for (int i = 0; i < rear; i++) {
  // arr[i] = arr[i + 1];
  // }

  // rear--;

  // return front;
  // }

  // public static int peek() {
  // if (isEmpty()) {
  // return -1;
  // }

  // return arr[0];
  // }
  // }

  // static class ArrayCircularQueue {
  // static int arr[];
  // static int size;

  // static int rear = -1;
  // static int front = -1;

  // ArrayCircularQueue(int n) {
  // arr = new int[n];
  // this.size = n;
  // }

  // public static boolean isEmpty() {
  // return rear == -1 && front == -1;
  // }

  // public static boolean isFull() {
  // return (rear + 1) % size == front;
  // }

  // // Add function - enqueue
  // public static void add(int data) {
  // if (isFull()) {
  // System.out.println("Full Queue");
  // return;
  // }

  // // For adding first element
  // if (front == -1) {
  // front = 0;
  // }

  // rear = (rear + 1) % size;
  // arr[rear] = data;
  // }

  // public static int remove() {
  // if (isEmpty()) {
  // return -1;
  // }

  // int result = arr[front];

  // // if there is only one element
  // if (rear == front) {
  // rear = front = -1;
  // }
  // // else move to the next pos using the special formula
  // else {
  // front = (front + 1) % size;
  // }

  // return result;
  // }

  // public static int peek() {
  // if (isEmpty()) {
  // return -1;
  // }

  // return arr[front];
  // }
  // }

  // public static void main(String[] args) {
  // ArrayCircularQueue q = new ArrayCircularQueue(5);

  // q.add(1);
  // q.add(2);
  // q.add(3);
  // q.add(4);
  // q.add(5);

  // System.out.println("________");

  // System.out.println(q.remove());
  // /*
  // * [1, 2, 3, 4, 5]
  // * | |
  // * front rear
  // *
  // * [X, 2, 3, 4, 5]
  // * | |
  // * front rear
  // */

  // q.add(6);

  // /*
  // * [X, 2, 3, 4, 5]
  // * | |
  // * front rear
  // *
  // * [6, 2, 3, 4, 5]
  // * | |
  // * rear front
  // */

  // System.out.println("________");

  // System.out.println(q.remove());

  // /*
  // * [6, 2, 3, 4, 5]
  // * | |
  // * rear front
  // *
  // * [6, X, 3, 4, 5]
  // * | |
  // * rear front
  // */

  // q.add(7);

  // /*
  // * [6, X, 3, 4, 5]
  // * | |
  // * rear front
  // *
  // * [6, 7, 3, 4, 5]
  // * | |
  // * rear front
  // */

  // System.out.println("________");

  // while (!q.isEmpty()) {
  // System.out.println(q.peek());
  // q.remove();
  // }

  // }

  static class LinkedQueue {

    static class Node {
      int data;
      Node next;

      Node(int data) {
        this.data = data;
        next = null;
      }

    }

    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty() {
      return head == null && tail == null;
    }

    // Add function - enqueue
    public static void add(int data) {

      Node newNode = new Node(data);

      if (tail == null) {
        tail = head = newNode;
        return;
      }

      tail.next = newNode;
      tail = newNode;
    }

    public static int remove() {
      if (isEmpty()) {
        return -1;
      }

      int front = head.data;

      if (head == tail) {
        tail = null;
      }

      head = head.next;

      return front;
    }

    public static int peek() {
      return head.data;
    }
  }

  public static void main(String[] args) {
    LinkedQueue q = new LinkedQueue();

    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
