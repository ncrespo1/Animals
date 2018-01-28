package jUnit.test;

import com.company.*;
import org.junit.*;
/**
 * @author Nicolas Crespo
 * @version 2017.3.3
 */

public class Dog_test extends junit.framework.TestCase  {
    private boolean isFriendly;
    private String name;

    @Test
    public void testDog(boolean friendly, String name) {
        this.isFriendly = friendly;
        this.name = name;
    }

    public void testCreateDog() {
        Dog dog = new Dog(true, "TestDog");
        this.isFriendly = dog.isFriendly();
        this.name = dog.getName();
        assertTrue("Dog should be friendly", isFriendly);
        assertEquals("Dog name should be TestDog", this.name, name);

    }

    public void testSetUp() {
        isFriendly = true;
        assertTrue("Dog should be friendly", isFriendly);
    }


    public void testIsDogFriendly() {
        testSetUp();
        assertTrue("Dog should be friendly", isFriendly);
    }

}
