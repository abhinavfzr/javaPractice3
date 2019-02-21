package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelRemoveCheckTest {
    VowelRemoveCheck app;
    @Before
    public void setUp() throws Exception {
        app= new VowelRemoveCheck();
    }

    @After
    public void tearDown() throws Exception {
        app=null;
    }

    @Test
    public void test8() {
        //Arrange
        String str[] = {"india", "germany"};
        String expectedValue[] = {"nd", "grmny"};
        //Act
        String actualValue[] = app.vowelRemove(str, 2);
        //Assert
        assertArrayEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }
}