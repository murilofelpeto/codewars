package com.codewars.kyu.six.breakCamelCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BreakCamelCaseTest {

  @Test
  public void tests() {
    assertEquals("camel Casing", BreakCamelCase.camelCase("camelCasing"));
    assertEquals("camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
    assertEquals("camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
  }

}