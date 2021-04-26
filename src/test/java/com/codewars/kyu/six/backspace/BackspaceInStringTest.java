package com.codewars.kyu.six.backspace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BackspaceInStringTest {

  private static BackspacesInString bis;

  @BeforeAll
  public static void init() {
    bis = new BackspacesInString();
  }

  @Test
  public void testCleanString() {
    assertEquals("ac", bis.cleanString("abc#d##c"));
  }

  @Test
  public void testCleanStringShouldReturnEmpty() {
    assertEquals("", bis.cleanString("abc####d##c#"));
  }

}