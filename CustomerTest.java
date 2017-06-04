import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sonny on 6/3/2017.
 */

/**
 * This is the customer test class.
 */
public class CustomerTest {
    Customer sonny = new Customer("Sonny");

    /**
     * Example of assertEquals.
     */
    @Test
    public void getName() throws Exception {
        assertEquals("Sonny", sonny.getName());
    }

    /**
     * Example of assertFalse.
     */
    @Test
    public void testUnhappy() throws Exception {
        assertFalse(sonny.isHappy());
    }

    /**
     * Example of assertTrue.
     */
    @Test
    public void testHappy() throws Exception {
        sonny.eatFood();
        assertTrue(sonny.isHappy());
    }

}
