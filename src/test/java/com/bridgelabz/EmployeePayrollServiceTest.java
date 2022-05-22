package com.bridgelabz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import java.util.Arrays;

public class EmployeePayrollServiceTest {
    
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployeePayrollData[] arrayOfEmps = {
                new EmployeePayrollData(1, "Raj", 50000),
                new EmployeePayrollData(2, "David", 55000),
                new EmployeePayrollData(3, "Sam", 60000),
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.File_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.File_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.File_IO);
        Assertions Assert = null;
        Assert.assertEquals(3, entries);
    }
}
