package src.com.christianpari.functional_interfaces;

import java.util.function.Function;

public class FunctionDemo {
  public void show() {
    Function<String, Integer> map = str -> str.length();
    Integer length = map.apply("Sky");
    System.out.println(length);
  }
}
