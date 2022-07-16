package com.numbers.buzznumber;

import com.numbers.NumberSystem;

public class BuzzNumber extends NumberSystem{

    public boolean isValid(int number){

        int count = 0;
        int temp = number;
        int buzzNumber = 7;

        while(count != 1){
            number = number % 10;
            count = count + 1;
        }

        if(temp % buzzNumber == 0 || number == buzzNumber){
            return true;
        } else {
            return false;
        }
    }
}
