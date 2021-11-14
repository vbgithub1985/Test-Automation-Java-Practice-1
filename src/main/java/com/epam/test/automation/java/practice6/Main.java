package com.epam.test.automation.java.practice6;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new SalesPerson("Ivanov", 156000, 100 );
        Employee em2 = new SalesPerson("Petrov", 200000, 120 );
        Employee em3 = new SalesPerson("Sidorov", 150000, 70 );
        Employee em4 = new SalesPerson("Panacotov", 140000, 220 );
        Employee m1 = new Manager("Ivanov manager", 1000000, 100);
        Employee m2 = new Manager("Petrov manager", 2000000, 200);
        Employee m3 = new Manager("Ivanov manager", 3000000, 500);
        Company company = new Company(em1, em2, em3, em4, m1, m2, m3);
        System.out.println(company.toString());
        company.giveEverybodyBonus(2000);
        System.out.println(company.toString());
        System.out.println(company.TotalToPay());
        System.out.println(company.nameMaxSalary());


    }
}
