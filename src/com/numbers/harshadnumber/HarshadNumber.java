package com.numbers.harshadnumber;

import com.numbers.NumberSystem;

public class HarshadNumber extends NumberSystem {
    public boolean isValid(int number){
        int temp = number;
        int sum = 0;
        while (number != 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        if(temp % sum == 0){
            return true;
        } else {
            return false;
        }
    }
}
