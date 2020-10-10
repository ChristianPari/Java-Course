package com.christianpari;

public class TaxReport {

    private TaxCalculator calculator;

//    constructor injection
//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

//    setters
//    setter injection
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

}
