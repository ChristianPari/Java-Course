package com.christianpari.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
  public static void show() {
    List<String> list = new ArrayList<>();
//    list.add("a");
//    list.add("b");
//    list.add("c");
//  can add an item at a specific index of a List by the overloaded method that takes an integer and an item; below
//    list.add(0, "!");
    Collections.addAll(list, "a", "b", "c");
//  set(index, item) - replaces the element at a given index
//    list.set(0, "a+");
//  remove() - removes an element at a given index
//    list.remove(0);
//    System.out.println(list.get(0));
//    System.out.println(list.indexOf("a"));
    System.out.println();
    /*
    .set(index, value) - inserts the value at the specified index
    .remove(index) - removes an index and its value from a list
    .get(index) - retrieves a value from the list at the specified index
    .indexOf(value) - returns the index of the item or -1 if not within the list
    .lastIndexOf(value) - returns the last index that the value appears at
    .subList(start, upTo) - returns a new list with the values of the range
                            not including the "upTo" index

     */
  }
}
