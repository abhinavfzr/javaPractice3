package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionArrayTest {
    ExceptionArray app;
    @Before
    public void setUp() throws Exception {
        app= new ExceptionArray();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }

    @Test
    public void test7() {
        //Arrange
        String expectedValue = "ExceptionCaught";
        //Act
        String actualValue = app.Exception(0);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}