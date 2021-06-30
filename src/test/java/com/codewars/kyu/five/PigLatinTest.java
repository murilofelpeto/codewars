package com.codewars.kyu.five;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PigLatinTest {

  @Test
  void testHelloWorld() {
    final var pigLatin = PigLatin.pigIt("Hello world");
    assertThat(pigLatin).isEqualTo("elloHay orldway");
  }

  @Test
  void testPigLatinIsCool() {
    final var pigLatin = PigLatin.pigIt("Pig latin is cool");
    assertThat(pigLatin).isEqualTo("igPay atinlay siay oolcay");
  }

  @Test
  void testThisIsMyString() {
    final var pigLatin = PigLatin.pigIt("This is my string !");
    assertThat(pigLatin).isEqualTo("hisTay siay ymay tringsay !");
  }

  @Test
  void testOMyGod() {
    final var pigLatin = PigLatin.pigIt("O my god");
    assertThat(pigLatin).isEqualTo("Oay ymay odgay");
  }
}