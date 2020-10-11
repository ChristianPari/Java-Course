package com.christianpari;

public class Employee {
//    INSTANCE FIELDS
    private int baseSalary;
    private int hourlyRate;

//    STATIC FIELDS
    public static int numberOfEmployees;

//    CONSTRUCTOR
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

//    STATIC METHODS
    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

//    INSTANCE METHODS
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
//    overloaded method
    public int calculateWage() {
        return calculateWage(0);
    }

//    GETTERS AND SETTERS
    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be less than or equal to 0");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("HourlyRate cannot be less than 0");
        this.hourlyRate = hourlyRate;
    }
}
