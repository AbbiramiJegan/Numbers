package com.numbers.happynumber;

import java.util.ArrayList;
import com.numbers.NumberSystem;

public class HappyNumber extends NumberSystem {

    public static int happyNumber(int number){
        int sum = 0;
        while(number != 0){
            int remainder = number % 10;
            sum = sum + (remainder * remainder);
            number = number / 10;
        }
        return sum;
    }

    ArrayList<Integer> set = new ArrayList<Integer>();

    boolean isTrue = true;
    public boolean isValid(int number){
        this.set.add(number);
        while (number != 1 && isTrue == true){
            number = this.happyNumber(number);
            if(set.contains(number)){
                isTrue = false;
            }
            this.set.add(number);
        }

        if(number == 1){
            return true;
        } else {
            return false;
        }
    }
}
