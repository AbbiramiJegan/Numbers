package com.numbers.palindromenumber;

import com.numbers.utility.Utility;
import com.numbers.NumberSystem;

public class PalindromeNumber extends NumberSystem {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int number = scanner.nextInt();
//    }

    public boolean isValid(int number){
        int reversedNumber = Utility.reversedNumber(number);
        if(number == reversedNumber){
            return true;
        } else {
            return false;
        }
    }
}
