package LinkedList;

public class LinkedList {
  Node head;
  private int size;

  LinkedList() {
    this.size = 0;
  }

  class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
      this.next = null;
      size++;
    }

  }

  public void addToFront(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addToLast(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
      return;
    }

    Node ptr = head;

    while (ptr.next != null) {
      ptr = ptr.next;
    }

    ptr.next = newNode;
  }

  public void printList() {

    if (head == null) {
      System.out.println("Empty list");
      return;
    }

    Node ptr = head;
    while (ptr.next != null) {
      System.out.print(ptr.value + " -> ");
      ptr = ptr.next;
    }
    System.out.println(ptr.value);
  }

  public void deleteFromFront() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;
    head = head.next;
  }

  public void deleteFromLast() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    size--;

    if (head.next == null) {
      head = null;
      return;
    }

    Node secondLast = head;
    Node last = head.next;

    while (last.next != null) {
      last = last.next;
      secondLast = secondLast.next;
    }

    secondLast.next = null;
  }

  public void removeElement(int value) {

    while (head != null && head.value == value) {
      head = head.next;
    }

    if (head == null) {
      System.out.println("Removed");
      return;
    }

    Node ptr = head;
    while (ptr.next != null) {
      if (ptr.next.value == value) {
        ptr.next = ptr.next.next;
      } else {
        ptr = ptr.next;
      }
    }

    size--;
  }

  public void removeEleFromIndex(int index) {
    if (head == null) {
      System.out.println("Removed");
      return;
    }

    Node ptr = head;

    for (int i = 0; i < index - 1; i++) {
      ptr = ptr.next;
    }
    ptr.next = ptr.next.next;
    size--;
  }

  public int getSize() {
    return size;
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    list.addToFront(1);
    list.addToFront(2);
    list.addToFront(3);

    list.printList();

    list.addToLast(4);
    list.addToLast(5);
    list.addToLast(6);

    list.printList();

    list.deleteFromFront();
    list.printList();

    list.deleteFromLast();
    list.printList();

    System.out.println(list.getSize());

    list.removeElement(1);

    list.printList();

    list.removeEleFromIndex(0);

    list.printList();
  }
}
