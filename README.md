# Number Types Project

## Overview

This project is a collection of Java programs that identify and work with various special types of numbers. Each type of number has its own class or function to determine its properties, and these can be used to explore and understand different numerical concepts.

## Number Types Implemented

The project includes implementations for the following special number types:

- **Adam Numbers**: A number that when squared and reversed results in the square of the number's reverse.
- **Armstrong Numbers**: A number that is equal to the sum of its own digits each raised to the power of the number of digits.
- **Automorphic Numbers**: A number whose square ends in the same digits as the number itself.
- **Buzz Numbers**: A number that is either divisible by 7 or ends with the digit 7.
- **Happy Numbers**: A number that leads to 1 when replaced by the sum of the square of its digits repeatedly.
- **Harshad Numbers**: A number that is divisible by the sum of its digits.
- **Krishnamurthy Numbers**: A number that is equal to the sum of the factorial of its digits.
- **Neon Numbers**: A number whose square's digits sum up to the original number.
- **Palindrome Numbers**: A number that remains the same when its digits are reversed.
- **Prime Numbers**: A number that is greater than 1 and has no positive divisors other than 1 and itself.

## Project Structure

The project is organized into the following directories and files:

- **adamnumbers/**: Contains the implementation of Adam numbers.
- **armstrongnumber/**: Contains the implementation of Armstrong numbers.
- **automorphicnumber/**: Contains the implementation of Automorphic numbers.
- **buzznumber/**: Contains the implementation of Buzz numbers.
- **happynumber/**: Contains the implementation of Happy numbers.
- **harshadnumber/**: Contains the implementation of Harshad numbers.
- **krishnamurthynumber/**: Contains the implementation of Krishnamurthy numbers.
- **models/**: Includes any models or data structures used in the project.
- **neonnumber/**: Contains the implementation of Neon numbers.
- **palindromenumber/**: Contains the implementation of Palindrome numbers.
- **primenumbers/**: Contains the implementation of Prime numbers.
- **services/**: Contains services or utilities that facilitate the operations.
- **utility/**: Contains utility functions that are commonly used across the project.
- **Main.java**: The main entry point for running the application.
- **NumberSystem.java**: Defines the interface or abstract class for different number types.
- **NumberSystemFactory.java**: Implements the factory pattern to create instances of different number types.

## How to Use

1. **Clone the repository**:
    ```bash
    https://github.com/AbbiramiJegan/Numbers.git
    cd number-types
    ```

2. **Compile the Java files**:
    ```bash
    javac -d bin src/*.java
    ```

3. **Run the Main class**:
    ```bash
    java -cp bin Main
    ```

## Requirements

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or higher installed to compile and run the project.

## Customization

You can add more number types by creating a new directory with the number's name and implementing its logic in a Java class. Ensure to register the new number type in the `NumberSystemFactory.java` to make it accessible through the factory.
