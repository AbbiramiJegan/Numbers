package com.numbers.adamnumbers;

import com.numbers.NumberSystem;
import com.numbers.utility.Utility;

public class AdamNumbers extends NumberSystem {
    public boolean isValid(int number){
        int squareOfNumber = number * number;
        int reversed = Utility.reversedNumber(number);
        int squareOfReversed = reversed * reversed;
        int reversedOfSquare = Utility.reversedNumber(squareOfReversed);
//        int reversedOfSquare = 0;
//        while(squareOfReversed != 0){
//            int remainder = squareOfReversed % 10;
//            reversedOfSquare = reversedOfSquare * 10 + remainder;
//            squareOfReversed = squareOfReversed / 10;
//        }
        boolean isAdamNumber = true;
        if(squareOfNumber == reversedOfSquare){
            return isAdamNumber;
        }else{
            isAdamNumber = false;
            return isAdamNumber;
        }

    }
}
