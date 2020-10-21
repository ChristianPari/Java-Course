package com.christianpari.generics;
/*
Using "T" within angle brackets after the name of the class
is the type parameter; T is for Template, E is for Element

Class Parameter

You must specify the type of data that will be stored in the
class when you create it like a method takes parameter

by exntending either interfaces or other classes makes
whatever data being passed in for T bound / restricted
to that type...
If T extends Number class then you cannot pass String
into the argument of the class instantiation
 */
public class GenericList<T>{
//  T represents the data
//  Java compiler doesnt know what T will be so to work around
//  error cast an Object[] as a T[]
  private T[] items = (T[]) new Object[10];
  private int count;

  public void add(T item) {
    items[count++] = item;
  }

  public T get(int index) {
    return items[index];
  }
}
