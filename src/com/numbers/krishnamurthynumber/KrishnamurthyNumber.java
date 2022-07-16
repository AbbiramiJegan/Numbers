package com.numbers.krishnamurthynumber;

import com.numbers.utility.Utility;
import com.numbers.NumberSystem;

public class KrishnamurthyNumber extends NumberSystem {
    public boolean isValid(int number){
        int sum = 0;
        int temp = number;
        while(number != 0){
            int remainder = number % 10;
            sum = sum + Utility.factorialNumber(remainder);
            number = number / 10;
        }
        if(temp == sum){
            return true;
        } else {
            return false;
        }
    }
}
