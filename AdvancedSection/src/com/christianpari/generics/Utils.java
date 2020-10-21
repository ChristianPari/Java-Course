package com.christianpari.generics;

public class Utils {
  public static <T extends Comparable<T>> T max(T first, T second) {
    return (first.compareTo(second) < 0) ? second : first;
  }

  public static <K, V> void print(K key, V value) {
    System.out.println(key + "=" + value);
  }

  public static void printUser(User user) {
    System.out.println(user);
  }

//  ? is wildcard, pass a argument of an unknown type
//  if wanting to read from a list, use extends keyword and extend the class or parent class
//  if wanting to add to the list, use the super keyword and declare the parent class
//  public static void printUsers(GenericList<? extends User> users) {
//    User x = users.get(0);
//  }
//  or
  public static void printUsers(GenericList<? super User> users) {
    GenericList<Object> temporary = new GenericList<>();
    Object x = users.get(0);
  }
}
