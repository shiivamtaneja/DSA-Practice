package Queue;

public class Queue {

  static class ArrayQueue {
    static int arr[];
    static int size;

    static int rear = -1;

    ArrayQueue(int n) {
      arr = new int[n];
      this.size = n;
    }

    public static boolean isEmpty() {
      return rear == -1;
    }

    // Add function - enqueue
    public static void add(int data) {
      if (rear == size - 1) {
        System.out.println("Full Queue");
        return;
      }

      rear++;
      arr[rear] = data;
    }

    public static int remove() {
      if (isEmpty()) {
        return -1;
      }

      int front = arr[0];

      for (int i = 0; i < rear; i++) {
        arr[i] = arr[i + 1];
      }

      rear--;

      return front;
    }

    public static int peek() {
      if (isEmpty()) {
        return -1;
      }

      return arr[0];
    }
  }

  public static void main(String[] args) {
    ArrayQueue q = new ArrayQueue(5);

    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
