import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Create a program that prints to the terminal specific data if the user enters a value that is:
      // divisible by 3? = "Buzz"
      // divisible by 5? = "Fizz"
      // both above? = "FizzBuzz"
      // neither? = value inputted
    System.out.print("Number: ");
    int userInput = scanner.nextInt();
    
    System.out.print("Response: ");
      if (userInput % 3 == 0 && userInput % 5 == 0)
        System.out.println("FizzBuzz");
      else if (userInput % 3 == 0)
        System.out.println("Buzz");
      else if (userInput % 5 == 0)
        System.out.println("Fizz");
      else
        System.out.println(userInput);

      scanner.close();
  }
}
