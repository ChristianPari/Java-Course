import java.text.NumberFormat;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // Mortgage Caluculator Project
    // expression
    // P * ( (r * (1+r)^n) / ((1+r)^n) - 1 )
    // P = Principal
    // r = Interest Rate
    // n = Number of Payments; we will be doing years for period so multiply this period by 12; result is n
    // use Math.pow() to use ^n

    final byte PERCENT = 100;
    final byte MONTHS_IN_YEAR = 12;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Principal: ");
    int principal = scanner.nextInt();

    System.out.print("Annual Interest Rate: ");
    float annualRate = scanner.nextFloat();
    float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
    System.out.println(monthlyRate);

    System.out.print("Period (Years): ");
    byte years = scanner.nextByte();
    int numberOfPayments = years * MONTHS_IN_YEAR;
    
    double mortgage = principal
                    * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments))
                    / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
    String mortgageInCurrency = NumberFormat.getCurrencyInstance().format(mortgage);

    System.out.print("Mortage: " + mortgageInCurrency);

    scanner.close();
    
    //NOTES

    // byte = 1 = [-128, 127]
    // short = 2 = [-32k, 32k]
    // int = 4 = [-2b, 2b]
    // long = 8 => even larger than 2b
    // float = 4 => decimals
    // double = 8 => larger decimals
    // char = 2 = [A,B,C,...]
    // boolean = 1 = [true/false]

    // reference types are tricky
    // be sure to remember that a refernece is being assigned to a variable. So if a variable is being assigned to another, it's reference is being assigned and the data changed to one of the variables will affect all the varaibles using the reference type

    // to print data in an array you need the Arrays package and use Arrays.toString(arrayName) and Arrays.deepToString(arrayName) for Mulit-deminsional arrays

    // implicit casting = automatic casting by Java
    // byte => short => int => long => float => double
    // happens when no chance of data lose

    // explicit casting
    // double x = 1.1;
    // int y = (int)x + 2;
    // by (int)x we are explicitly converting the x variable into an integer from a double

    // to convert a string number to a number you must use the correct wrapper class and then it's method parse"wrapperClassNameHere"(value)
  }
}
