package com.codewars.kyu.six.backspace;

public class BackspacesInString {

  public String cleanString(String s) {
    while (s.matches(".*[^#]#.*")) s = s.replaceAll("[^#]#", "");
    return s.replaceAll("#","");
  }
}
