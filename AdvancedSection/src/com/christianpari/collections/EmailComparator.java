package com.christianpari.collections;

import java.util.Comparator;

public class EmailComparator implements Comparator<Customer> {
//  one would use this interface when they have the need to compare fields of other Objects
//  or to sort a List of Objects

  @Override
  public int compare(Customer o1, Customer o2) {
    return o1.getEmail().compareTo(o2.getEmail());
  }
}
