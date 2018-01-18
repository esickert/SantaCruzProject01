package TDD;

import org.junit.Before;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumbersTest {

    Numbers testClass = new Numbers();
    Integer c = new Integer(4); //just playing with the Integer class. No instances created.

    @Test
    public void testTwoPlusTwo() throws Exception {

        int result = 0;

        assertEquals(result,testClass.addNumbers());
    }

    @Test
    public void testTwominusTwo() throws Exception  {
        int result = 3;

        assertEquals(result, testClass.minusTwoNumbers());
    }
}