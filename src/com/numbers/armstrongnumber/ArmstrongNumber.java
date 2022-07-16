package com.numbers.armstrongnumber;

import com.numbers.NumberSystem;
import java.util.Scanner;

public class ArmstrongNumber extends NumberSystem {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int number = scanner.nextInt();
//    }

    public boolean isValid(int number){
        int temp = number;
        int tempTwo = number;
        int count = 0;
        double power = 0;

        while(number != 0){
            number = number / 10;
            count = count + 1;
        }

        while (temp != 0){
            int remainder = temp % 10;
            temp = temp / 10;
            power = power + Math.pow(remainder, count);
        }

        if(power == tempTwo){
            return true;
        } else {
            return false;
        }
    }
}
