package com.codewars.kyu.seven.creditcard;

public class CreditCard {

  public static String maskify(String str) {
    return str.replaceAll(".(?=.{4})", "#");
  }
}
