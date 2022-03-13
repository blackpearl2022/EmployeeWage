
package com.bridgelabz.employee;

public class EmployeeWage {
    public static void main(String[] args) {
        int IsFullTime = 1;
        int EmployeRatePerHour = 20;
        int EmployeWages = 0;
        int EmployeHour = 0;
        double EmpCheck = Math.floor(Math.random() * 10) % 2;
        if (EmpCheck == IsFullTime)
            EmployeHour = 8;
        else
            EmployeHour = 0;
        EmployeWages = EmployeHour * EmployeRatePerHour;
        System.out.println("Employewage: " + EmployeWages );
    }
}