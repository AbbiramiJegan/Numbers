package com.numbers.utility;

public class Utility {

    public static String encode(int number){
        String[] array = {"Prime", "Adam", "Armstrong", "Palindrome", "Automorphic", "Neon", "Harshad", "Krishnamurthy", "Buzz", "Happy"};
        return array[number - 1];
    }

    public static int reversedNumber(int number){
        int reversed = 0;
        while(number != 0){
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        return reversed;
    }

    public static int factorialNumber(int number){
        int factorial = 1;
        for(int i = 1; i <= number; i = i + 1){
            factorial = factorial * i;
        }
        return factorial;
    }


}
