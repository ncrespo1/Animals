package jUnit.test;
import com.company.*;
import org.junit.*;

/**
 * @author Nicolas Crespo
 * @version 2017.3.3
 */
public class Cat_test extends junit.framework.TestCase {
    private int mousesKilled;

    @Test
    public void testCat() {
        Cat cat = new Cat(0, "Test");
        assertTrue("Mice killed is not less than zero", mousesKilled >= 0);
        assertTrue("Cat name is not equal to null", cat.getName() != null);
    }

    public void testSetUp() {
        mousesKilled = 0;
        assertEquals("Mice killed should be zero", 0, mousesKilled);
    }

    public void testAddMice() {
        mousesKilled++;
        assertTrue("Mice killed should be less than zero", mousesKilled > 0);
    }




}
