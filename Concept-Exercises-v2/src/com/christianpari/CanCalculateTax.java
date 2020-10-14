// interfaces should be small and lightweight
// INTERFACE SEGREGATION PRINCIPLE
// - Divide a big interface into smaller ones
//  interfaces should be focused on a single capability

package com.christianpari;

public interface CanCalculateTax {
//  there is only method declaration within an interface
//  interfaces should be focused on a single capability
  double calculateTax();
}
