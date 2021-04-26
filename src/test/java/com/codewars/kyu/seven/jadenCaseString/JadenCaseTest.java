package com.codewars.kyu.seven.jadenCaseString;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class JadenCaseTest {

  JadenCase jadenCase = new JadenCase();

  @Test
  public void test() {
    assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
  }

  @Test
  public void testNullArg() {
    assertNull(jadenCase.toJadenCase(null));
  }

  @Test
  public void testEmptyArg() {
    assertNull(jadenCase.toJadenCase(""));
  }


}