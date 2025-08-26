package Employee_Management_System;

public abstract class Employee implements Payable {
    private int id;
    private String name;
    private Department department;

    public Employee(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public abstract void work();

    // Overloaded method
    public double calculateSalary(double bonus) {
        return calculateSalary() + bonus;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + department);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public Department getDepartment() { return department; }
}
