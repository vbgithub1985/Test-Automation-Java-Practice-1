package com.epam.test.automation.java.practice6;

import java.util.Arrays;

public class Company {
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public Company(Employee... employees) {
        this.employees = employees;
    }

    public void giveEverybodyBonus(double companyBonus){
        for (int i = 0; i < employees.length; i++) {
            employees[i].setBonus(companyBonus);
        }
    }

    public double TotalToPay(){
        double result = 0.0;
        for (int i = 0; i < employees.length; i++) {
            result+=employees[i].toPay();
        }
        return result;
    }

    public String nameMaxSalary(){
        double maxSalary = employees[0].toPay();
        int maxI = 0;
        for (int i = 1; i < employees.length; i++) {
            double empSalary = employees[i].toPay();
            if (empSalary>maxSalary){
                maxSalary = empSalary;
                maxI = i;
            }
        }
        return employees[maxI].getName();
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees="+"\n" + Arrays.toString(employees) +
                '}';
    }
}
