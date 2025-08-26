package Employee_Management_System;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, Department department, String programmingLanguage) {
        super(id, name, department);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is writing code in " + programmingLanguage);
    }

    @Override
    public double calculateSalary() {
        return 60000; // base salary
    }
}
