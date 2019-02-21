package com.stackroute.p3;

public class CheckException
{
    //Write a program that will generate exceptions of type NegativeArraySizeException,
    String checkExcepetion(int a[], int s1) //5th question
    {

        for (int i = 0; i < s1; i++) {
            if (a[i] < 0) {
                return "NegativeArraySizeException";
            }

        }
        return "noexception";
    }

}
