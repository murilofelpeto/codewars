package com.codewars.kyu.six.dubstep;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DubStepTest {

  @Test
  public void Test1() {
    assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
  }
  @Test
  public void Test2()
  {
    assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
  }

}