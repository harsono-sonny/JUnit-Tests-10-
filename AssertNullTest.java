import org.junit.Test;

import static org.junit.Assert.*;

/**
* AssertNull test
*/

/**
* Create a test case with assertNull to check for a nullpointer
*/

public class AssertNulTest {
  
  @Test
  public void test() {
    ArrayList b = NullPoint.initializer(0);
    assertNull(b);
  }
}
