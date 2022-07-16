package com.numbers.services;

import com.numbers.models.NumberType;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.numbers.models.NumberType;

/*
We are implementing singleton design pattern for this service
Note: this does not mean all services are going to be singleton design pattern

Services are created to perform CRUD operation (CREATE, READ, UPDATE, DELETE)
Usually Services will have atleast 4 methods
In read method
1. Read the data from text file (line by line)
2. Convert the raw data (line) to data (here we use split method)
3. Create the object (instance of the model) by passing the data
4. Add the object to ArrayList of object
5. Return the ArrayList of object
 */

public class FileRepositoryService {

    // 1st step block people from creating object of this class
    // convert the constructor to private
    private FileRepositoryService() {
    }

    // 2nd step create a class variable to ensure there is only one exist
    private static FileRepositoryService fileRepositoryService;

    // 3rd step create a method that always return the same instance of FileRepositosryService
    public static FileRepositoryService getInstance() {
        if (fileRepositoryService == null) fileRepositoryService = new FileRepositoryService();
        return fileRepositoryService;
    }

    public ArrayList<NumberType> read(){
        ArrayList<NumberType> numberTypes = new ArrayList<NumberType>();
        try{
            File obj = new File("src/data.txt");
            Scanner reader = new Scanner(obj);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                String[] dataSpilt = data.split("\\|");
                int number = Integer.parseInt(dataSpilt[0]);
                String type = dataSpilt[1];
                NumberType numberTypeobj = new NumberType(number, type);
                numberTypes.add(numberTypeobj);
            }
            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
        return numberTypes;
    }
}
