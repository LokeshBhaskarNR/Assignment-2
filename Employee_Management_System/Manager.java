package Employee_Management_System;

public class Manager extends Employee {
    private int teamSize;

    public Manager(int id, String name, Department department, int teamSize) {
        super(id, name, department);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing a team of " + teamSize + " employees.");
    }

    @Override
    public double calculateSalary() {
        return 80000 + (teamSize * 1000);
    }
}
