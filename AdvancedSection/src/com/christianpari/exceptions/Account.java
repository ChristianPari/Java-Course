package com.christianpari.exceptions;

import java.io.IOException;

public class Account {
  private float balance;

  public void deposit(float value) throws IOException {
//    defensive programming
    if (value <= 0)
//      if wanting to throw an exception that would be considered
//      unhandled then add the throws statement to the method
      throw new IOException();
  }

  public void withdraw(float value) throws AccountException {
    if (value > balance) {
      throw new AccountException(new InsufficientFundsException());
//      var fundsException = new InsufficientFundsException();
//      var accountException = new AccountException();
//      accountException.initCause(fundsException);
//      throw accountException;
    }
  }
}
