package cs2.adt;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {
  private class Node {
    //Fields
    public T data;
    public Node next;
    //Constructor
    public Node(T d, Node n) {
      data = d; next = n;
    }
  }
  //Field
  private Node head;

  //Constructor
  public LinkedStack() {
    head = null;
  }

  //Methods
  public void push(T item) {
    head = new Node(item, head);
  }
  public T pop() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException();
    T retVal = head.data;
    head = head.next;
    return retVal;
  }
  public T peek() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException();
    return head.data;
  }
  public boolean isEmpty() {
    return head == null;
  }
}
