package src.com.christianpari.functional_interfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
  public static void show() {
    List<String> list = List.of("a", "b", "c");

    Consumer<String> print = (String item) -> System.out.println(item);
    Consumer<String> printUpperCase = (String item) -> System.out.println(item.toUpperCase());

    // chaining Consumers by way of the andThen() method
    list.forEach(print.andThen(printUpperCase));

    // can iterate over the list in 2 ways

    // Imperative Programming (for loops, if/else, switch/case)
      // implementing logic using instructions
    // for loop below
//    for (var item : list)
//      System.out.println(item);

    // Declarative Programming
      // specifying what needs to be done
    // using the forEach() method that takes a Consumer
//    list.forEach((Integer item) -> {
//      System.out.println(item);
//    });
    // cleaner
//    list.forEach(item -> System.out.println(item));
  }
}
