package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksCheckTest {
 StudentMarksCheck app;
    @Before
    public void setUp() throws Exception {
        app= new StudentMarksCheck();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }


    @Test
    public void test1() {
        //Arrange
        boolean expectedValue = false;
        int[] a = {12, 122, 11};

        //Act
        boolean actualValue = app.StudentMarks(3, a);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}