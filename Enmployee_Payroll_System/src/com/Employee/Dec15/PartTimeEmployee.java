package com.Employee.Dec15;

public class PartTimeEmployee extends Employee {

    int hoursWorked;
    int hourlyPay;

    public PartTimeEmployee(int id, String name, String email, String department, int hoursWorked, int hourlyPay) {
        super(id, name, email, department, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }

    @Override
    public int calculateSalary() {
        return hoursWorked * hourlyPay;
    }
}
