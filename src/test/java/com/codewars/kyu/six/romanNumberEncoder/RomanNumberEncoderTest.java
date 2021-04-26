package com.codewars.kyu.six.romanNumberEncoder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanNumberEncoderTest {

  private RomanNumberEncoder conversion = new RomanNumberEncoder();

  @Test
  public void shouldConvertToRoman() {
    assertEquals("I", "I", conversion.solution(1));
    assertEquals("IV", "IV", conversion.solution(4));
    assertEquals("VI", "VI", conversion.solution(6));
  }

}