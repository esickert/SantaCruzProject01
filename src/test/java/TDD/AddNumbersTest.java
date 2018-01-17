package TDD;

import org.junit.Before;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AddNumbersTest {


    AddNumbers testClass = new AddNumbers();


    @Test
    public void testTwoPlusTwo() throws Exception {

        int result = 2 + 2;

        assertEquals(result, testClass.addNumbers());
    }

}