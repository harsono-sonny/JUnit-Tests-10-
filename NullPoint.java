import org.junit.Test;

/**
* AssertNull Example
*/

/**
* We start with a conditionally initialized arraylist, then we don't satisfy that condition
*/
public class NullPoint {
  public static Arraylist initializer(int a) {
    ArrayList list;
    if(a == 0){
      list = new ArrayList<>();
    else{
      list = null;
    }
    return list;
    }
  }
}
