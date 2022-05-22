package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
        public enum IOService{console_IO, File_IO, DB_IO, ioService, Rest_IO}
        private List<EmployeePayrollData> employeePayrollList;
        public EmployeePayrollService(){
        }
        public EmployeePayrollService(List<EmployeePayrollData>employeePayrollList){
            this.employeePayrollList = employeePayrollList;
        }

        public static void main(String[] args) {
            ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
            EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
            Scanner consoleInputReader = new Scanner(System.in);
            employeePayrollService.readEmployeePayrollData(consoleInputReader); //to read the data
            employeePayrollService.writeEmployeePayrollData();      //to write the data
        }

    public void writeEmployeePayrollData() {
    }
            //Taking scanner to read it from console
    private void readEmployeePayrollData(Scanner consoleInputReader){
            System.out.println("Enter Employee ID: ");
            int id = consoleInputReader.nextInt();
            System.out.println("Enter Employee Name: ");
            String name = consoleInputReader.next();
            System.out.println("Enter Employee Salary: ");
            double salary = consoleInputReader.nextDouble();

            //Adding data to the list with the help of creating object EmployeePayrollData
            employeePayrollList.add(new EmployeePayrollData(id, name, salary));
}
            //Writing the data into the console
            public void writeEmployeePayrollData(IOService ioService){
            if (ioService.equals(IOService.console_IO))
            System.out.println("\nWriting Employee Payroll to console\n" + employeePayrollList);

            else if (ioService.equals(IOService.File_IO))
                new EmployeePayrollFileIOService().writeData(employeePayrollList);
        }

        public long readEmployeePayrollData(IOService ioService){
            return 0;
        }
        public void printData(IOService ioService) {
            if (ioService.equals(IOService.ioService))
                new EmployeePayrollFileIOService().printData();
        }
        public long countEntries(IOService ioService){
            return 0;
        }
}