package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckExceptionTest {
     CheckException app;
    @Before
    public void setUp() throws Exception {
        app= new CheckException();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }


    @Test
    public void test6() {
        //Arrange
        int a[] = {1, -2, 3};
        String expectedValue = "NegativeArraySizeException";
        //Act
        String actualValue = app.checkExcepetion(a, 3);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}