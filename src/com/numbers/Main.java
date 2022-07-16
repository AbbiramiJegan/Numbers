package com.numbers;

import com.numbers.NumberSystemFactory;
import com.numbers.models.NumberType;
import com.numbers.services.FileRepositoryService;
import com.numbers.utility.Utility;

import java.util.Scanner;
import java.util.ArrayList;
import com.numbers.NumberSystem;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> contents = new ArrayList<String>();
        contents.add("0. Exit");
        contents.add("1. Prime Number");
        contents.add("2. Adam Number");
        contents.add("3. Armstrong Number");
        contents.add("4. Palindromic Number");
        contents.add("5. Automorphic Number");
        contents.add("6. Neon Number");
        contents.add("7. Harshad Number");
        contents.add("8. Krishnamurthy Number");
        contents.add("9. Buzz Number");
        contents.add("10. Happy Number");
        contents.add("99. Process");
        System.out.println("Choose your number system: " + contents);

        int option = -1;
        while(option != 0){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please choose a number system: ");
            option = scanner.nextInt();
            if(option != 0){
                if(option == 99){
                    // FileRepositoryService fileRepositoryService = new FileRepositoryService();
                    FileRepositoryService fileRepositoryService = FileRepositoryService.getInstance();
                    ArrayList<NumberType> name = fileRepositoryService.read();
                    for (int i = 0; i < name.size(); i++){
                        NumberType numberType = name.get(i);
                        String key = numberType.getType();
                        NumberSystem numberSystem = NumberSystemFactory.getNumberSystem(key);
                        int number = numberType.getNumber();

                        boolean isValid = numberSystem.isValid(number);
                        if(isValid == true){
                            System.out.println(number + " is a " + key + " number");
                        } else {
                            System.out.println(number + " is not a " + key + " number");
                        }
                    }

                } else {
                    String key = Utility.encode(option);
                    NumberSystem numberSystem = NumberSystemFactory.getNumberSystem(key);
                    Scanner obj = new Scanner(System.in);
                    System.out.print("Please enter a number: ");
                    int number = obj.nextInt();

                    boolean isValid = numberSystem.isValid(number);
                    if(isValid == true){
                        System.out.println(number + " is a " + key + " number");
                    } else {
                        System.out.println(number + " is not a " + key + " number");
                    }
                }
            }

//            if(contents.get(option) == contents.get(1)){
//                Scanner obj = new Scanner(System.in);
//                System.out.print("Please enter a number: ");
//                int number = obj.nextInt();
//
//                boolean isPrime = numberSystem.isValid(number);
////                boolean isPrime = object.isPrimeNumber(number);
////                Without creating an object we call the method by just using method.
////                If we declare the method as static
////                boolean isPrime = com.numbers.primenumbers.PrimeNumbers.isPrimeNumber(number);
//                if(isPrime == true){
//                    System.out.println(number + " is a prime number");
//                } else {
//                    System.out.println(number + " is not a prime number");
//                }
//            } else if(contents.get(option) == contents.get(2)){
//                Scanner object = new Scanner(System.in);
//                System.out.print("Please enter a number: ");
//                int number = object.nextInt();
////                NumberSystem numberSystem = com.numbers.NumberSystemFactory.getNumberSystem("Adam");
//                boolean isAdamNumber = numberSystem.isValid(number);
////                boolean isAdamNumber = com.numbers.adamnumber.AdamNumbers.isAdamNumber(number);
//                if(isAdamNumber == true){
//                    System.out.println(number + " is an adam number");
//                } else {
//                    System.out.println(number + " is not an adam number");
//                }
//            }
        }
    }
}
