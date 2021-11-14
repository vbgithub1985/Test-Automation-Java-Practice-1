package com.epam.test.automation.java.practice6;

public abstract class Employee {
    private String name;
    private double salary;
    protected double bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public  void setSalary(double salary) {
        this.salary = salary;
    }

    public double toPay(){
        return salary + bonus;
    }

    abstract void setBonus(double bonus);


}
