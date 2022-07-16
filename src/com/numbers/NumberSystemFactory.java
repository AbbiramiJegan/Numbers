package com.numbers;

import com.numbers.NumberSystem;
import com.numbers.adamnumbers.AdamNumbers;
import com.numbers.armstrongnumber.ArmstrongNumber;
import com.numbers.automorphicnumber.AutomorphicNumber;
import com.numbers.buzznumber.BuzzNumber;
import com.numbers.happynumber.HappyNumber;
import com.numbers.harshadnumber.HarshadNumber;
import com.numbers.krishnamurthynumber.KrishnamurthyNumber;
import com.numbers.neonnumber.NeonNumber;
import com.numbers.palindromenumber.PalindromeNumber;
import com.numbers.primenumbers.PrimeNumbers;

public class NumberSystemFactory {
    public static NumberSystem getNumberSystem(String key){

        if(key.equals("Prime")){
            PrimeNumbers primeNumbers = new PrimeNumbers();
            return primeNumbers;
        } else if(key.equals("Adam")){
            AdamNumbers adamNumbers = new AdamNumbers();
            return adamNumbers;
        } else if(key.equals("Armstrong")){
            ArmstrongNumber armstrongNumber = new ArmstrongNumber();
            return armstrongNumber;
        } else if(key.equals("Palindrome")){
            PalindromeNumber palindromeNumber = new PalindromeNumber();
            return palindromeNumber;
        } else if(key.equals("Automorphic")){
            AutomorphicNumber automorphicNumber = new AutomorphicNumber();
            return automorphicNumber;
        } else if(key.equals("Neon")){
            NeonNumber neonNumber = new NeonNumber();
            return neonNumber;
        } else if(key.equals("Harshad")){
            HarshadNumber harshadNumber = new HarshadNumber();
            return harshadNumber;
        } else if(key.equals("Krishnamurthy Number")){
            KrishnamurthyNumber krishnamurthyNumber = new KrishnamurthyNumber();
            return krishnamurthyNumber;
        } else if(key.equals("Buzz Number")){
            BuzzNumber buzzNumber = new BuzzNumber();
            return buzzNumber;
        } else {
            HappyNumber happyNumber = new HappyNumber();
            return happyNumber;
        }
    }
}
