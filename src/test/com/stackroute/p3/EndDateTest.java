package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndDateTest {
    EndDate app;
    @Before
    public void setUp() throws Exception {
        app= new EndDate();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }

    @Test
    public void test5() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = app.endDate();
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}