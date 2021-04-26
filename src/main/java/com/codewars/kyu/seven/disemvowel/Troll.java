package com.codewars.kyu.seven.disemvowel;

public class Troll {

  public static String disemvowel(String Z) {
    return Z.replaceAll("(?i)[aeiou]" , "");
  }
}
