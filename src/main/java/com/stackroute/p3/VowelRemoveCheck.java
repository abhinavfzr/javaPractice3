package com.stackroute.p3;

public class VowelRemoveCheck
{

    //Write a program to set up an array of places, Loop round and remove the vowels. Display the new
    //words in console
    String[] vowelRemove(String str[], int n) //7th question
    {
        for (int i = 0; i < n; i++) {

            str[i] = str[i].replaceAll("[AaEeIiOoUu]", "");
        }
        return str;
    }
}
