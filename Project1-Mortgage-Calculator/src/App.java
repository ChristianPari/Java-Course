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

    Scanner scanner = new Scanner(System.in);

    final byte PERCENT = 100;
    final byte MONTHS_IN_YEAR = 12;

    int principal = getPrincipal(scanner);
    // another way
    /*
    int principal = 0;
    while (true) {
      System.out.print("Principal: ");
      principal = scanner.nextInt();
      if (principal >= 1_000 && principal <= 1_000_000)
        break;
      System.out.println("Enter a value between 1000 and 1000000")
    }
    */

    // greater than 0 or less than or equal to 30
    float annualRate = getAnnualRate(scanner);
    float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;

    byte years = getYears(scanner);
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

  public static int getPrincipal(Scanner scanner) {

    System.out.print("Principal ($1K - $1M): ");
    int principal = scanner.nextInt();

    if (principal >= 1_000 && principal <= 1_000_000) {
      return principal;
    } else {
      System.out.println("Enter a value between 1000 and 1000000");
      return getPrincipal(scanner);
    }
  }

  public static float getAnnualRate(Scanner scanner) {

    System.out.print("Annual Interest Rate: ");
    float annualRate = scanner.nextFloat();

    if (annualRate >= 1 && annualRate <= 30) {
      return annualRate;
    } else {
      System.out.println("Enter a value greater than 0 and less than or equal to 30");
      return getAnnualRate(scanner);
    }
  }

  public static byte getYears(Scanner scanner) {
  
    System.out.print("Period (Years): ");
    byte years = scanner.nextByte();

    if (years >= 1 && years <= 30) {
      return years;
    } else {
      System.out.println("Enter a value greater than 0 and less than or equal to 30");
      return getYears(scanner);
    }
  }
}
