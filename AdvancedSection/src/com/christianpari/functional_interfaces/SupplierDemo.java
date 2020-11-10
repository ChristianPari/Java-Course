package src.com.christianpari.functional_interfaces;

import java.util.function.Supplier;

public class SupplierDemo {
  public void show() {
    Supplier<Double> getRandomNumber = () -> {return Math.random();};
    // can be shortened to () -> Math.random();
    Double randomNumber = getRandomNumber.get();
    // the method for generating a random number is not executed until we explicitly
    // run the .get() method of the Supplier<> variable
  }
}
