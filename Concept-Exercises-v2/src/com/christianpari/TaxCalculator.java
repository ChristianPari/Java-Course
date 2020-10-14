package com.christianpari;

public class TaxCalculator implements CanCalculateTax {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

//    annotation for Java Compiler
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
