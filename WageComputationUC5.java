package com.bridgelabz.EmployeeWage;
public class WageComputationUC5 {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int empHrsFullTime = 8;
        int empHrsPartTime = 4;
        int dailyWage;
        int empWagePerHrs = 20;
        double empCheck = Math.floor((Math.random() * 10) % 3);

        if (empCheck == IS_FULL_TIME){
            System.out.println("Employee is present");
            dailyWage = empHrsFullTime * empWagePerHrs;
            System.out.println("Daily wage = " + dailyWage);
        }
        else if (empCheck == IS_PART_TIME){
            System.out.println("Employee is Part time present");
            dailyWage = empHrsPartTime * empWagePerHrs;
            System.out.println("Daily wage = " + dailyWage);
        }
        else
            System.out.println("Employee is absent");
    }
}