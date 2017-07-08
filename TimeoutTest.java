import org.junit.Test;

import static org.junit.Assert.*;

/**
* Test case with a timeout counter
*/

public class TimeoutTest {
 
  @Test (timeout = 1000) /**The timeout counter is in millisecounds so you will want to adjust this number based on how much is getting done in the loop then add a bit for wiggle room*/
  public void test() {
    int three = InfiniteLoop.Loop(1);
    assertEquals(1, three, 0);
  }
}
