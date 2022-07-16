package com.numbers.automorphicnumber;

import com.numbers.utility.Utility;
import com.numbers.NumberSystem;

public class AutomorphicNumber extends NumberSystem {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int number = scanner.nextInt();
//    }

    public boolean isValid(int number){
        int squareOfNumber = number * number;
        int temp = number;
        int tempTwo = number;
        int count = 0;

        while (number != 0){
            number = number / 10;
            count = count + 1;
        }

        int reversed = 0;
        int counter = 0;
        while(count != counter){
            int remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp = temp / 10;
            counter = counter + 1;
        }

        int tempReversed = Utility.reversedNumber(reversed);
        if(tempTwo == tempReversed){
            return true;
        } else {
            return false;
        }
    }
}
