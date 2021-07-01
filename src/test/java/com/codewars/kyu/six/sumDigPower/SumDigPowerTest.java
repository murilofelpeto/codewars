package com.codewars.kyu.six.sumDigPower;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SumDigPowerTest {

  @Test
  void sumDigPow() {
    assertThat(SumDigPower.sumDigPow(1, 10)).asList().containsExactly(1L,2L,3L,4L,5L,6L,7L,8L,9L);
    assertThat(SumDigPower.sumDigPow(1, 100)).asList().containsExactly(1L,2L,3L,4L,5L,6L,7L,8L,9L,89L);
    assertThat(SumDigPower.sumDigPow(10, 100)).asList().containsExactly(89L);
    assertThat(SumDigPower.sumDigPow(90, 100)).asList().isEmpty();
    assertThat(SumDigPower.sumDigPow(90, 150)).asList().containsExactly(135L);
    assertThat(SumDigPower.sumDigPow(50, 150)).asList().containsExactly(89L,135L);
    assertThat(SumDigPower.sumDigPow(10, 150)).asList().containsExactly(89L,135L);
  }
}