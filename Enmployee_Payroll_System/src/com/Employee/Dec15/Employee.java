package com.Employee.Dec15;

import all.Exceptions.InvalidEmailException;
import all.Exceptions.InvalidSalaryException;

public class Employee {
    private int id;
    private String name;
    private String email;
    private String department;
    private int baseSalary;

    public Employee(int id, String name, String email, String department, int baseSalary) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setBaseSalary(baseSalary);
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
    public int getBaseSalary() { return baseSalary; }

    public void setBaseSalary(int salary) throws InvalidSalaryException {
        if (salary < 0) throw new InvalidSalaryException("Salary cannot be negative!");
        this.baseSalary = salary;
    }

    public void setEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") || email.contains(" ")) {
            throw new InvalidEmailException("Invalid Email Format");
        }
        this.email = email;
    }

    public int calculateSalary() { 
        return baseSalary;   // Overridden in child classes
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("---------------------------");
    }
}
