package com.bridgelabz.EmployeeWage;
public class WageComputationUC3 {
    public static void main(String[] args) {
        int WAGE_PER_HR = 20;
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int FULL_DAY = 8;
        int PART_TIME = 4;
        int dailyWage;
        int empCheck = (int) (Math.floor((Math.random() * 10)) % 3);
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
            dailyWage = WAGE_PER_HR * FULL_DAY;
            System.out.println("Daily wage of an employee = " + dailyWage);
        }
        else if (empCheck == IS_PART_TIME) {
            System.out.println("Employee is part time");
            dailyWage = WAGE_PER_HR * PART_TIME;
            System.out.println("Daily wage of part time employee = " + dailyWage);
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}