package Employ;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String dept = scanner.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();
                    EmployDao.insertEmployee(name, dept, salary);
                    break;

                case 2:
                    EmployDao.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    EmployDao.updateEmployeeSalary(updateId, newSalary);
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int deleteId = scanner.nextInt();
                    EmployDao.deleteEmployee(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

