package com.codewars.kyu.five.numbersInPrimes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class NumbersInPrimeTest {

  @Test
  void factors() {
    assertThat(NumbersInPrime.factors(7775460)).isEqualTo("(2**2)(3**3)(5)(7)(11**2)(17)");
  }
}