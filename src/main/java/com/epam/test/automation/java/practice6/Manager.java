package com.epam.test.automation.java.practice6;

public class Manager extends Employee{
    private int quantity;

    public Manager(String name, double salary, int quantity) {
        super(name, salary);
        this.quantity = quantity;
    }

    @Override
    void setBonus(double bonus) {
        if (quantity>100 && quantity<=200) this.bonus = bonus+500;
        else if (quantity>200 ) this.bonus = bonus+1000;
        else this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name=" + getName() +
                ", salary="+getSalary()+
                ", quantity=" + quantity +
                ", toPay=" + toPay()+
                '}'+"\n";
    }
}
