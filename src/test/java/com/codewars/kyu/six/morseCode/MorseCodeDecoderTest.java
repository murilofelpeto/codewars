package com.codewars.kyu.six.morseCode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MorseCodeDecoderTest {

  @Test
  public void testExampleFromDescription() {
    assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")).isEqualTo("HEY JUDE");
  }
}