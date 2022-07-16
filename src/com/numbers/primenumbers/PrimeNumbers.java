package com.numbers.primenumbers;

import java.util.Scanner;
import com.numbers.NumberSystem;

public class PrimeNumbers extends NumberSystem{

    public boolean isValid(int number){
        int i = 2;
        boolean isPrime = true;
        while(i < number){
            if(number % i == 0){
                isPrime = false;
            }
            i = i + 1;
        }
        if(isPrime == false){
            return false;
        } else {
            return true;
        }
    }
}
