package com.codewars.kyu.six.breakCamelCase;

public class BreakCamelCase {

  public static String camelCase(String input) {
    return input.replaceAll("([A-Z])", " $1");
  }
}
