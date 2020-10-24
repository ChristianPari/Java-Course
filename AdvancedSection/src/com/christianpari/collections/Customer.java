package com.christianpari.collections;

public class Customer implements Comparable<Customer> {
  private String name;
  private String email;

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

//  below is used to sort objects by alphabetical order regarding a certain field
  @Override
  public int compareTo(Customer other) {
    return name.compareTo(other.name);
  }

//  due to what we are wanting to return, here its the String variable name when printing the object
  @Override
  public String toString() {
    return name;
  }
}
