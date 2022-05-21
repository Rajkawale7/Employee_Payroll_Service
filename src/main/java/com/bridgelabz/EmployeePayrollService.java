package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
        public enum IOService{console_IO,File_IO}
        private static List<EmployeePayRollData> employeePayrollList;
        public EmployeePayrollService(){
        }
        public EmployeePayrollService(List<EmployeePayRollData>employeePayrollList){
            this.employeePayrollList = employeePayrollList;
        }

        public static void main(String[] args) {
            ArrayList<EmployeePayRollData> employeePayrollList = new ArrayList<>();
            EmployeePayrollService employeePayRollService = new EmployeePayrollService(employeePayrollList);
            Scanner consoleInputReader = new Scanner(System.in);
            EmployeePayrollService.readEmployeePayrollData(consoleInputReader);
            employeePayRollService.writeEmployeePayrollData();
        }
        public static void readEmployeePayrollData(Scanner consoleInputReader){
            System.out.println("Enter Employee ID: ");
            int id = consoleInputReader.nextInt();
            System.out.println("Enter Employee Name: ");
            String name = consoleInputReader.next();
            System.out.println("Enter Employee Salary: ");
            double salary = consoleInputReader.nextDouble();
            employeePayrollList.add(new EmployeePayRollData(id, name, salary));
        }

        private void writeEmployeePayrollData(){
            System.out.println("\nWriting Employee Payroll to console\n" + employeePayrollList);
        }
}