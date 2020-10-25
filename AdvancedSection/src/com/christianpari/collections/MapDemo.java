package com.christianpari.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
  public static void show() {
    Customer c1 = new Customer("a", "e1");
    Customer c2 = new Customer("b", "e2");
    Map<String, Customer> map = new HashMap<>();
    map.put(c1.getEmail(), c1);
    map.put(c2.getEmail(), c2);

    Customer customer = map.get("e1");
    /*
    Methods...
    .put(K, V) - K is the key, and V is the value, adds this property to the Map
    .get(K) - K is the key, returns the value of the key
    .getOrDefault(K, default) - if K (key) does not exist then return the specified default value
    .containsKey(K) - returns true or false
    .replace(K, object) - replaces the key value pair that K is connected to with the new object
    .keySet() - an iterable method that returns all the keys of a map
    .entrySet() - returns a set of key value pairs that is iterable; data looks [K=V, K=V]
    .getValue() or .getKey() - used to get the Key or Value from the set when iterating over an entrySet()
    .values() - returns a collection (not guaranteed in order) of the data which is also iterable
     */
  }
}
