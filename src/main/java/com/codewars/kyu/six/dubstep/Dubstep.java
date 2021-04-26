package com.codewars.kyu.six.dubstep;

public class Dubstep {

  public static String SongDecoder(String song) {
    return song.replaceAll("WUB", " ").trim().replaceAll(" +", " ");
  }
}
