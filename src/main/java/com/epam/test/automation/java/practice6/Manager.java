package com.epam.test.automation.java.practice6;

public class Manager extends Employee{
    private int quantity;

    public Manager(String name, double salary, int quantity) {
        super(name, salary);
        this.quantity = quantity;
    }

    @Override
    void setBonus(double bonus) {
        if (quantity>100 && quantity<=150) bonus+=500;
        else if (quantity>150 ) bonus+=1000;
    }
}
