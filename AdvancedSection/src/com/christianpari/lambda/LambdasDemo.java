package src.com.christianpari.lambda;

public class LambdasDemo {
  public static String prefix = "-";

  public static void show() {
//    String prefix = "-";

//    below is a lambda expression
//    greet((String message) -> {
//      System.out.println(message);
//      System.out.println("Above was from LAMBDA EXPRESSION");
//    });
//    cleaner below
    greet(message -> System.out.println(prefix + message));

//    below is an anonymous inner class
//    it is anonymous bc this class does not have a name
//    it is simply an implementation
//    called inner class bc it is being used within a method
//
//    greet(new Printer() {
//      @Override
//      public void print(String message) {
//        System.out.println(message);
//        System.out.println("Above was from ANONYMOUS INNER CLASS");
//      }
//    });

//    call the greet method and pass in a class that implements the Printer Interface
//
//    greet(new ConsolePrinter());
  }

  public static void greet(Printer printer) {
    printer.print("Printing from an object that implements from the Printer Interface!");
  }
}
