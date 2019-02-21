package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    ConsecutiveCheck app;
    @Before
    public void setUp() throws Exception {
        app= new ConsecutiveCheck();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }
    @Test
    public void test3() {
        //Arrange
        boolean expectedValue = false;
        int[] a = {1, 2, 4};

        //Act
        boolean actualValue = app.consecutive(a, 3);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}