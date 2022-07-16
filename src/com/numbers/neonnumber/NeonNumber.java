package com.numbers.neonnumber;

import com.numbers.NumberSystem;

public class NeonNumber extends NumberSystem {
    public boolean isValid(int number){
        int square = number * number;
        int sum = 0;
        while (square != 0){
            sum = sum + square % 10;
            square = square / 10;
        }
        if(sum == number){
            return true;
        } else {
            return false;
        }
    }
}
