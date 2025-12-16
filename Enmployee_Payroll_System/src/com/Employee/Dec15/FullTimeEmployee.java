package com.Employee.Dec15;

public class FullTimeEmployee extends Employee {

    int bonus;
    int taxRate; // taxRate in percent (10 means 10%)

    public FullTimeEmployee(int id, String name, String email, String department, int salary, int bonus, int taxRate) {
        super(id, name, email, department, salary);
        this.bonus = bonus;
        this.taxRate = taxRate;
    }

    @Override
    public int calculateSalary() {
        int taxAmount = (getBaseSalary() * taxRate) / 100;
        return getBaseSalary() + bonus - taxAmount;
    }
}
