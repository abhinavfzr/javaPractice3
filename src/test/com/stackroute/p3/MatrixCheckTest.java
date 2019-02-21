package com.stackroute.p3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {
    MatrixCheck app;
    @Before
    public void setUp() throws Exception {
        app= new MatrixCheck();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }

    @Test
    public void test2() {
        //Arrange
        boolean expectedValue = true;
        boolean actualValue = true;
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}};
        int[][] s = {{10, 10, 10}, {10, 10, 10}};
        int[][] arr;

        //Act
        arr = app.Matrix(2, 3, a, b);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] != s[i][j]) {
                    expectedValue = false;
                }
            }
        }

        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}