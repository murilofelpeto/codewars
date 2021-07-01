package com.codewars.kyu.four;

public class SudokuValidator {

  public static boolean check(int[][] sudoku) {
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 8; col++) {
        for (int col2 = col + 1; col2 < 9; col2++) {
          if (sudoku[row][col] == sudoku[row][col2] || sudoku[row][col] == 0) {
            return false;
          }
        }
      }
    }

    // column checker
    for (int col = 0; col < 9; col++) {
      for (int row = 0; row < 8; row++) {
        for (int row2 = row + 1; row2 < 9; row2++) {
          if (sudoku[row][col] == sudoku[row2][col]) {
            return false;
          }
        }
      }
    }

    // grid checker
    for (int row = 0; row < 9; row += 3) {
      for (int col = 0; col < 9; col += 3) {
        // row, col is start of the 3 by 3 grid
        for (int pos = 0; pos < 8; pos++) {
          for (int pos2 = pos + 1; pos2 < 9; pos2++) {
            if (sudoku[row + pos % 3][col + pos / 3] == sudoku[row + pos2 % 3][col + pos2 / 3]) {
              return false;
            }
          }
        }
      }
    }

    return true;
  }
}
