package com.codewars.kyu.seven.creditcard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CreditCardTest {

  @Test
  public void testSolution() {
    assertEquals("############5616", CreditCard.maskify("4556364607935616"));
    assertEquals("#######5616", CreditCard.maskify("64607935616"));
    assertEquals("1", CreditCard.maskify("1"));
    assertEquals("", CreditCard.maskify(""));

    // "What was the name of your first pet?"
    assertEquals("##ippy", CreditCard.maskify("Skippy"));
    assertEquals(
        "####################################man!",
        CreditCard.maskify("Nananananananananananananananana Batman!"));
  }
}
