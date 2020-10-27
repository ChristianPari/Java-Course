package com.christianpari.collections;

import java.util.*;

public class SetDemo {
//  set interface does not guarantee the order of items
  public static void show() {
//    Set<String> set = new HashSet<>();
//    set.add("sky");
//    set.add("is");
//    set.add("blue");
//    set.add("blue");
//    System.out.println(set);
//  prints [sky, blue, is]
//    Collection<String> collection = new ArrayList<>();
//    Collections.addAll(collection, "a", "b", "c", "c");
//    below creates a new set from a list in one line
//    Set<String> set = new HashSet<>(collection);
    Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
    Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));
    /*
    Operations...
    Union - adding one Set to another via addAll() [ set1.addAll(set2) // returns [a, b, c, d] ]
    Intersection - by using retainAll() you keep only items that appear in both sets [ set1.retainAll(set2) // returns [b, c] ]
    Difference - by using removeAll() you take away everything from the being compared set
                 that is within the comparing set [ set1.removeAll(set2) // returns [a] ]
     */
  }
}
