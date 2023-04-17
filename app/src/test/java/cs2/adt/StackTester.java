package cs2.adt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;

public class StackTester {
  private Stack<Integer> s;

  @BeforeEach
  void init() {
    s = new ArrayStack<Integer>();
  }

  @Test
  void testSinglePushPop() {
    s.push(1);
    assertFalse(s.isEmpty());
    assertEquals(s.peek(), 1);
    assertEquals(s.pop(), 1);
    assertTrue(s.isEmpty());
  }

  @Test
  void testMultiPushPop() {
    assertTrue(s.isEmpty());
    for(int i=0; i<100; i++) {
      s.push(i);
      assertFalse(s.isEmpty());
    }
    for(int i=99; i>=0; i--) {
      assertEquals(s.peek(), i);
      assertEquals(s.pop(), i);
    }
    assertTrue(s.isEmpty());
  }

  @Test
  void testEmptyException() {
    assertTrue(s.isEmpty());
    try {
      s.peek();
      fail("peek() should have thrown EmptyStackException");
    }
    catch (EmptyStackException e) {
      //Do nothing
    }
    try {
      s.pop();
      fail("pop() should have thrown EmptyStackException");
    }
    catch (EmptyStackException e) {
      //Do nothing
    }

    s.push(1);
    try {
      s.pop();
    }
    catch (EmptyStackException e) {
      fail("pop() threw EmptyStackException on a non-empty Stack");
    }


  }

}
