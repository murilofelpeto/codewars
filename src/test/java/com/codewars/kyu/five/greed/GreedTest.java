package com.codewars.kyu.five.greed;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreedTest {

  @Test
  void greedy() {
    assertThat(Greed.greedy(new int[]{5,1,3,4,1})).isEqualTo(250);
    assertThat(Greed.greedy(new int[]{1,1,1,3,1})).isEqualTo(1100);
    assertThat(Greed.greedy(new int[]{2,4,4,5,4})).isEqualTo(450);
    assertThat(Greed.greedy(new int[]{6,6,6,5,5})).isEqualTo(700);
  }
}