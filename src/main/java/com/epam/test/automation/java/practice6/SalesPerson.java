package com.epam.test.automation.java.practice6;

public class SalesPerson extends Employee{
    private int persent;

    public SalesPerson(String name, double salary, int persent) {
        super(name, salary);
        this.persent = persent;
    }

    @Override
    void setBonus(double bonus) {
        if (persent>100 && persent<=200) bonus*=2;
        else if (persent>200 ) bonus*=3;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "name=" + getName() +
                ", salary="+getSalary()+
                ", bonus="+getSalary()+
                ", persent=" + persent +
                '}';
    }
}
