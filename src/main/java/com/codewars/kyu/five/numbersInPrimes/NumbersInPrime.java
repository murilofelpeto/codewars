package com.codewars.kyu.five.numbersInPrimes;

public class NumbersInPrime {

  public static String factors(int lst) {
    String result = "";
    for (int fac = 2; fac <= lst; ++fac) {
      int count;
      for (count = 0; lst % fac == 0; ++count) {
        lst /= fac;
      }
      if (count > 0) {
        result += "(" + fac + (count > 1 ? "**" + count : "") + ")";
      }
    }
    return result;
  }
}
