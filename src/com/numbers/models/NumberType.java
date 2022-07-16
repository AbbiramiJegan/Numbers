package com.numbers.models;

/*
When you are provided with a file/table, the data in the file must be mapped to a class
And this class is called Model
THe model class will have properties, getter method, setter method, constructor and tostring method
The properties are identified from line in the file or row in the table
In file each line has many columns and those columns are converted to properties

However this type of class (model class) can always be created whenever you want to pass data from one place to another place
Lets say you have a method that takes few parameters, when you call these methods you have 2 options
1. Send values for every single parameter
2. Convert all the parameters into a class and take the class as parameter, so that the caller can pass just a single object

Method 1:
public display(String firstName, String lastName, String icNumber, double outstandingBalance) { }
display("John", "David", "M58484584", 12345.65)

Method 2:
class Customer {
    String firstName;
    String lastName;
    String icNumber;
    double outstandingBalance;
}
public display(Customer customer) { }
Customer customer = new Customer("John", "David", "M5848485944", 12345.65)
display(customer)
 */

public class NumberType {

    int number;
    String type;

    public NumberType(int number, String type){
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NumberType{" +
                "number=" + number +
                ", type='" + type + '\'' +
                '}';
    }
}
