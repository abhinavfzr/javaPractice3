package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartDateTest {
     StartDate app;
    @Before
    public void setUp() throws Exception {
        app= new StartDate();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }

    @Test
    public void test4() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = app.startDate();
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}