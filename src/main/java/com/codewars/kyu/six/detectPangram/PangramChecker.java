package com.codewars.kyu.six.detectPangram;

public class PangramChecker {

  public boolean check(String sentence) {
    return sentence
            .chars()
            .map(Character::toLowerCase)
            .filter(Character::isAlphabetic)
            .distinct()
            .count()
        == 26;
  }
}
