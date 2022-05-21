package com.bridgelabz;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) {
        createFile();
    }

    private static void createFile() {
        try {
            // Creating the file object of a file
            File file = new File("C:\\Users\\Raj Kawale\\IdeaProjects\\EmployeePayrollService\\src\\Test.txt");
            if(file.createNewFile()){
                System.out.println("File Created "+file.getName());
            }else{
                System.out.println("File exist "+file.getName());
            }

        } catch (IOException e) {
            System.out.println("An unexpected error is occurred.");
            e.printStackTrace();
        }
    }
}