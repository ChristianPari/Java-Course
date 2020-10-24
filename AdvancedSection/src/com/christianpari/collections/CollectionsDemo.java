package com.christianpari.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
  public static void show() {
    Collection<String> collection = new ArrayList<>();
//    collection.add("a");
//    collection.add("b");
//    collection.add("c");
//    adding multiple items at a time? use Collections Class
    Collections.addAll(collection, "a", "b", "c");
/*
  Printing:...
    collection - will print the list [a, b, c]
    collcetion.size - gives amount of items which would be 3 here not 2 like length

  Methods:...
    .remove() - allows you to remove a specific item by passing the item as the argument
    .clear() - removes all items
    .contains() - by passing an item as argument it will return true or false
    .toArray() - w/ no arguments, returns ObjectArray so has Object methods
    .toArray(new String[0]) - returns a String array so now each item has String methods
    .sort() -

  Comparing collections for equality
    collection.equals(other) - will return true or false depending on the content of the objects
 */
  }
}