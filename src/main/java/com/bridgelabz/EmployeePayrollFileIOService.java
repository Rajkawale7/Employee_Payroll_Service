package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollFileIOService{
    public static String PAYROLL_FILE_NAME = "payroll-file.txt";

    public void writeData(List<EmployeePayrollData> employeePayrollList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME),empBuffer.toString().getBytes());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void printData(){
       try{
           Files.lines(new File("payroll-file.txt").toPath()).forEach(System.out::println);
       } catch (IOException e){
           e.printStackTrace();
       }
    }

    public long countEntries(){
        long entries = 0;
        try {
            entries = Files.lines(new File(PAYROLL_FILE_NAME).toPath()).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entries;
    }

    //Created Read Employee Data method
    public List <EmployeePayrollData> readData(){
        List<EmployeePayrollData>employeePayrollList = new ArrayList<>();  //Empty list
        try{
            //To populate the data and add to the list
            Files.lines(new File("payroll-file.txt").toPath()) //Reading the lines
                    .map(line-> line.trim()).forEach(line->System.out.println(line)); //Used map to read each and every lines from the list
        }catch (IOException e){
            e.printStackTrace();
        }
        return employeePayrollList;
    }
}
