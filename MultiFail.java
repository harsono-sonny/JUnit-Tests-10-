import org.junit.Test;

import static org.junit.Assert.*;

/**
* Multi Test Execution
*/

/**
* A class that will run a multi test on AssertNull, and InfiniteLoop with a timeout counter
*/

public class MultiFail {
  
  @Test (timeout = 500)
  public void test1() {
    int three = InfiniteLoop.Loop(1);
    assertEquals(1, three, 0);
  }
  @Test
    public void test2() {
    int three = Math.add(4,5);
    assertEquals(9, three, 0);
  }
    @Test
    public void test3() {
    int four = Math.add(4,4);
    assertEquals(9, four, 0);
  }
    @Test
    public void test4() {
      ArrayList a = NullPoint.initializer(0);
      assertNull(a);
  }
    @Test (timeout = 500)
    public void test1() {
      int three = InfiniteLoop.Loop(1);
      assertEquals(1, three, 0);
  }
}
