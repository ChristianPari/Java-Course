package com.christianpari.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
  public static void show() throws IOException {

    var account = new Account();
    try {
      account.withdraw(10);
    } catch (AccountException e) {
      var cause = e.getCause();
      System.out.println(cause.getMessage());
    }
//    try {
//      account.deposit(-1);
//    } catch (IOException e) {
//      System.out.println("Logging");
//      throw e;
//    }

//    sayHello(null);
    /*
    When catching exceptions
      if you need specific exception msgs then specify types
      otherwise you can call the hierarchy of the exception
      class if all are subclasses of a higher one and use
      generic msg

      if you want to give different exceptions the same error
      msg then use the pipe "or" operator ...
      catch (IOException | ParseException e) {}
     */
//    FileReader reader = null;
//    try with resource statement inside a try catch block
//    try (
//            var reader = new FileReader("file.txt");
//            var writer = new FileWriter("...");
//            ) {
//      reader = new FileReader("file.txt");
//      var value = reader.read();
//      new SimpleDateFormat().parse("");
//      System.out.println("File Opened");
//    }
//    catch (FileNotFoundException e) {
//      System.out.println("File Does Not Exist");
//    }
//    catch (IOException e) {
//      System.out.println("Could Not Read Data");
//    }
//    catch (ParseException e) {
//      e.printStackTrace();
//    }
//    finally will always get executed
//    finally {
//      if (reader != null) {
//        try {
//          reader.close();
//        } catch (IOException e) {
//          e.printStackTrace();
//        }
//      }
//    }
  }

//  public static void sayHello(String name) {
//    System.out.println(name.toUpperCase());
//  }
}
