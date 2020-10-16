package com.christianpari;

import com.christianpari.exceptions.ExceptionsDemo;

// EXCEPTIONS
/*
3 TYPES
CHECKED (compile-time exception)
    we developers should anticipate and recover
    from these errors

    the Java compiler lets us know of these with red underlines
    in our code and tell us that we haven't handled the exception

UNCHECKED (run-time exception)

NULL POINTER EXCEPTION
    when code is trying to evaluate data that is null
ARITHMETIC EXCEPTION
    when a number is trying to be divided by zero
ILLEGAL ARGUMENT EXCEPTION
    an argument passed to a method was not accepted
INDEX OUT OF BOUND EXCEPTION
    if you try to access an element in an array or string with
    an invalid index
ILLEGAL STATE EXCEPTION
    if you try to call a method but the underlying object is not
    in the right state

ERROR (indicates an error outside of the application)

 */

public class Main {

    public static void main(String[] args) {
        ExceptionsDemo.show();
    }
}
