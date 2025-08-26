package Employee_Management_System;
import java.util.*;

public class ThoughtClanEMSMenu {
    private static Scanner sc = new Scanner(System.in);
    private static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- ThoughtClan Employee Management System ---");
            System.out.println("1. Add Developer");
            System.out.println("2. Add Manager");
            System.out.println("3. Display All Employees");
            System.out.println("4. Show Work");
            System.out.println("5. Calculate Salaries");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addDeveloper();
                case 2 -> addManager();
                case 3 -> displayAllEmployees();
                case 4 -> showWork();
                case 5 -> calculateSalaries();
                case 6 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }

    private static void addDeveloper() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Programming Language: ");
        String lang = sc.nextLine();
        employees.add(new Developer(id, name, Department.DEVELOPMENT, lang));
        System.out.println("Developer added successfully!");
    }

    private static void addManager() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Team Size: ");
        int teamSize = sc.nextInt();
        employees.add(new Manager(id, name, Department.MANAGEMENT, teamSize));
        System.out.println("Manager added successfully!");
    }

    private static void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }

    private static void showWork() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }
        for (Employee emp : employees) {
            emp.work();
        }
    }

    private static void calculateSalaries() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }
        for (Employee emp : employees) {
            System.out.println(emp.getName() + "'s Salary: " + emp.calculateSalary());
        }
    }
}
