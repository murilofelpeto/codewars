package com.codewars.kyu.six.multiples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultipleOf3Or5Test {

  @Test
  public void test() {
    assertEquals(23, new MultipleOf3Or5().solution(10));
  }
}