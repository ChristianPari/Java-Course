package com.christianpari.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
  public static void show() {
    Queue<String> queue = new ArrayDeque<>();
    queue.add("c");
    queue.add("a");
    queue.add("b");
//    queue currently looks like b -> a -> c
//     if the Queue had a specific size and becomes full, add throws an exception
//     while offer returns false
//     queue.offer("d");
//    String front = queue.peek(); // returns the value of the item that is in the front of the queue
//    can use peek() or element() to get the front-most item
//    although if the queue is empty peek() will return null while element() will throw an exception

    /*
    Methods...

    offer() - similar to add() except throws and exception if no room left in queue
    peek() - returns the front-most item in queue
    element() - similar to peek() except throws exception is queue is empty
    remove() - removes the front-most item and returns it, but throws exception if the queue is empty
    poll() - similar to remove() except returns null if queue is empty
     */
  }
}
