package cs2.adt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.*;

public class QueueTester {
  private Queue<Integer> q;

  @BeforeEach
  void init() {
    q = new ArrayQueue<Integer>();
  }

  @Test
  void testSingleEnqueueDequeue() {
    assertTrue(q.isEmpty());
    q.enqueue(1);
    assertFalse(q.isEmpty());
    assertEquals(q.peek(), 1);
    assertEquals(q.dequeue(), 1);
    assertTrue(q.isEmpty());
  }

  @Test
  void testMultiEnqueueDequeue() {
    for(int i=0; i<100; i++) {
      q.enqueue(i);
      assertFalse(q.isEmpty());
    }
    for(int i=0; i<50; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    for(int i=200; i<300; i++) {
      q.enqueue(i);
    }
    for(int i=50; i<100; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    for(int i=200; i<300; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    assertTrue(q.isEmpty());
  }
  
  @Test
  void testExceptions() {
    try {
      q.peek();
      fail("peek() on Emtpy queue didn't throw exception");
    }
    catch(NoSuchElementException e) {
      //Do nothing
    }
    try {
      q.dequeue();
      fail("dequeue() on Emtpy queue didn't throw exception");
    }
    catch(NoSuchElementException e) {
      //Do nothing
    }

    q.enqueue(1);
    try {
      q.peek();
    } catch(NoSuchElementException e) {
      fail("Exception thrown from peek() when non-empty");
    }
    try {
      q.dequeue();
    } catch(NoSuchElementException e) {
      fail("Exception thrown from dequeue() when non-empty");
    }
  }


}
