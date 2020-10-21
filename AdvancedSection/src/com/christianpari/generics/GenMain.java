package com.christianpari.generics;

public class GenMain {
  public static void main(String[] args){
//    GenericList<Integer> numbers = new GenericList<>();
//    numbers.add(1); // Boxing
//    int number = numbers.get(0); // Unboxing

//    User user1 = new User(10);
//    User user2 = new User(10);
//    if (user1.compareTo(user2) < 0)
//      System.out.println("User1 < User2");
//    else if (user1.compareTo(user2) == 0)
//      System.out.println("User1 = User2");
//    else
//      System.out.println("User1 > User2");

//    User max = Utils.max(new User(10), new User(20));
//    System.out.println(max);
//    Utils.print(1, "Chris");

    User user = new Instructor(10);
    Utils.printUser(user);
  }
}
