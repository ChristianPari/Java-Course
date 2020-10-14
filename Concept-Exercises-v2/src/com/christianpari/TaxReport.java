package com.christianpari;

public class TaxReport {
  private CanCalculateTax calculator;

//  constructor injection
//  most common use of injections
//  public TaxReport(CanCalculateTax calculator) {
//    this.calculator = calculator;
//  }

//  method injection
//  pass the dependency as a argument/parameter into the method that
//  is actually going to be using said dependency
  public void show(CanCalculateTax calculator) {
    var tax = calculator.calculateTax();
    System.out.println(tax);
  }

//  setter injection
//  useful bc now we can change the dependencies throughout the lifetime
//  of the program
  public void setCalculator(CanCalculateTax calculator) {
    this.calculator = calculator;
  }
}
