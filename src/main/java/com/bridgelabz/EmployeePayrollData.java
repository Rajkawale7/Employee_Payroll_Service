package com.bridgelabz;

public class EmployeePayrollData {
    public int id;
    public String name;
    public double salary;

    //constructor for populating the data of EmployeePayrollData
    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //using toString methods to return the data
    public String toString() {
        return "id=" + id + ", name='" + name + '\'' + ", salary=" + salary;
    }
}
