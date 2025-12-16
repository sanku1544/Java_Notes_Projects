package com.Employee.Dec15;

import java.util.Scanner;

public class PayrollMain {

    public static void main(String[] args) {
        PayrollSystem ps = new PayrollSystem();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n===== PAYROLL MENU =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Sort By Salary");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();

            switch(choice) {
                case 1: ps.addEmployee(); break;
                case 2: ps.displayAllEmployees(); break;
                case 3: ps.searchEmployeeById(); break;
                case 4: ps.removeEmployee(); break;
                case 5: ps.sortBySalary(); break;
                case 6: System.exit(0);
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
