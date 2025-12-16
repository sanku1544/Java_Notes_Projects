package com.Employee.Dec15;

import java.util.Scanner;

public class PayrollSystem {

    Employee[] employees = new Employee[100];
    int count = 0;

    Scanner sc = new Scanner(System.in);

    // Add Employee
    public void addEmployee() {
        System.out.println("1. Full Time Employee");
        System.out.println("2. Part Time Employee");
        int choice = sc.nextInt();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Department: ");
        String dep = sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter Base Salary: ");
            int salary = sc.nextInt();
            System.out.print("Enter Bonus: ");
            int bonus = sc.nextInt();
            System.out.print("Tax Rate (%): ");
            int tax = sc.nextInt();

            employees[count++] = new FullTimeEmployee(id, name, email, dep, salary, bonus, tax);
        }
        else {
            System.out.print("Enter Hours Worked: ");
            int hw = sc.nextInt();
            System.out.print("Enter Hourly Pay: ");
            int hp = sc.nextInt();

            employees[count++] = new PartTimeEmployee(id, name, email, dep, hw, hp);
        }

        System.out.println("Employee Added Successfully!");
    }

    // Display all employees
    public void displayAllEmployees() {
        if(count == 0) {
            System.out.println("No employees to display!");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].displayDetails();
            System.out.println("Calculated Salary: " + employees[i].calculateSalary());
            System.out.println("--------------------------------");
        }
    }

    // Search employee
    public void searchEmployeeById() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                employees[i].displayDetails();
                return;
            }
        }
        System.out.println("Employee Not Found!");
    }

    // Remove employee
    public void removeEmployee() {
        System.out.print("Enter ID to remove: ");
        int id = sc.nextInt();

        int index = -1;

        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found!");
            return;
        }

        // Shift elements left
        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        count--;
        System.out.println("Employee removed!");
    }

    // Sort by salary
    public void sortBySalary() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (employees[i].calculateSalary() > employees[j].calculateSalary()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        System.out.println("Sorted Successfully!");
    }
}
