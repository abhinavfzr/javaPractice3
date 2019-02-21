package com.stackroute.p3;

public class ExceptionArray {

    String Exception(int b) //6th question
    {

        int a = 4;
        try {
            a = a / b;
        } catch (Exception ex) {
            return "ExceptionCaught";
        }
        return "ExceptionNotcaught";
    }

}
