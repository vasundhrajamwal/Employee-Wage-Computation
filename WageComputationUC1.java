package com.bridgelabz.EmployeeWage;
public class WageComputationUC1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Computation");
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == 1){
            System.out.println("Employee is present");
        }
        else
            System.out.println("Employee is absent");
    }
}

