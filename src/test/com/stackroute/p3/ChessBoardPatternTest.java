package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {

    ChessBoardPattern app;
    @Before
    public void setUp() throws Exception {
        app= new ChessBoardPattern();
    }

    @After
    public void tearDown() throws Exception {
        app=null;
    }

    @Test
    public void test9() {
        //Arrange
        String[][] expectedValue = {{"WW", "BB"}, {"BB", "WW"}};
        ;
        //Act
        String[][] actualValue = app.chess(2, 2);
        //Assert
        assertArrayEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}