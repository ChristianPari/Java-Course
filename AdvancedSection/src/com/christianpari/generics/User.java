package com.christianpari.generics;

public class User implements Comparable<User>{
  private int points;

  public User(int points) {
    this.points = points;
  }

  @Override
  public int compareTo(User other) {
//    this < other => negative value
//    this == other => 0
//    this > other => positive value
//    if (points < other.points) return -1;
//    if (points == other.points) return 0;
//    return 1;
    return points - other.points;
  }

  @Override
  public String toString() {
    return "Points=" + points;
  }
}
