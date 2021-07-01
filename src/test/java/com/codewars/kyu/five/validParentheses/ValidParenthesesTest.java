package com.codewars.kyu.five.validParentheses;

import static org.assertj.core.api.Assertions.assertThat;

import com.codewars.kyu.five.validParentheses.ValidParentheses;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

  @Test
  void isValid() {
    assertThat(ValidParentheses.isValid("()")).isTrue();
    assertThat(ValidParentheses.isValid("32423(sgsdg)")).isTrue();
    assertThat(ValidParentheses.isValid("adasdasfa")).isTrue();
  }

  @Test
  void isNotValid() {
    assertThat(ValidParentheses.isValid("())")).isFalse();
    assertThat(ValidParentheses.isValid("(dsgdsg))2432")).isFalse();
    assertThat(ValidParentheses.isValid("kK)q)(6M(l({a)+()C1y]t3p")).isFalse();
    assertThat(ValidParentheses.isValid("())(")).isFalse();
  }
}