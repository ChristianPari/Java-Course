package com.christianpari.collections;

import java.util.Iterator;
import java.util.List;

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

// made GenericList class iterable by implementing Iterable interface
public class GenericList<T> implements Iterable<T> {
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

//  returning a ListIterator object that knows how to iterate over a GenericList
  @Override
  public Iterator<T> iterator() {
    return new ListIterator(this);
  }

  private class ListIterator implements Iterator<T> {
    private GenericList<T> list;
    private int index;

    public ListIterator(GenericList<T> list) {
      this.list = list;
    }

    @Override
    public boolean hasNext() {
      return (index < list.count);
    }

    @Override
    public T next() {
      return list.items[index++];
    }
  }
}
