package com.stackroute.p3;

public class MatrixCheck
{
    //Write a program to compute the addition of two matrix, Read the number of rows and columns
//as input, also the values of each matrix
    int[][] Matrix(int n1, int n2, int a[][], int b[][])//2nd question
    {
        int[][] sum = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

}
