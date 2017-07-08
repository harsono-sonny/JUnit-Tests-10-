import org.junit.Test;

/**
* Timeout Test Example
*/

/**
* Example of a simple intentional infinite loop.
*/
public class InfiniteLoop {
  public static int loop(int one) {
    while (one==1) {
      one = 1;
    }
    return 2;
  }
}
