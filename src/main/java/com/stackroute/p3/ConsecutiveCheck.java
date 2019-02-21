package com.stackroute.p3;

public class ConsecutiveCheck
{
    //Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//assume the digits are a string and use split()
    boolean consecutive(int a[], int n) //3rd question
    {
        int k = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] != k) {
                return false;
            }
            k++;
        }
        return true;
    }

}
