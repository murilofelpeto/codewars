package com.codewars.kyu.six.arrayDiff;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayDiff {

  public static int[] arrayDiff(int[] a, int[] b) {
    final var listOne = Arrays.stream(a).boxed().collect(Collectors.toList());
    final var listTwo = Arrays.stream(b).boxed().collect(Collectors.toList());
    final var differences =
        listOne
            .stream()
            .filter(number -> !listTwo.contains(number))
            .collect(Collectors.toList());
    return differences
        .stream()
        .mapToInt(i->i)
        .toArray();
  }
}
