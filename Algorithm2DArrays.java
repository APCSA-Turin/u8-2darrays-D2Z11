
import java.util.ArrayList;

public class Algorithm2DArrays {
  private static int t = 1;

  /**
   * Return the sum of all elements of arr that are in the one particular row,
   * specified by the row parameter
   *
   * PRECONDITION: 0 <= row < arr.length (i.e. row is guaranteed to be valid)
   *
   * @param arr 2D array of ints
   * @param row the row to add up
   * @return the sum of all elements in row
   * 
   */
  public static int sumForRow(int[][] arr, int row) {
    int sum = 0;
    for (int i = 0; i < arr[row].length; i++) {
      sum += arr[row][i];
    }
    return sum;
  }

  /**
   * Return the sum of all elements of arr that are in the one particular column
   *
   * PRECONDITION: 0 <= col < arr[0].length (i.e. col is valid)
   *
   * @param arr 2D array of ints
   * @param col the column to add up
   * @return the sum of all elements in column
   */
  public static int sumForColumn(int[][] arr, int col) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i][col];
    }
    return sum;
  }

  /**
   * Replaces all even integers in arr with 0; all odd integers are unchanged.
   * It then returns the number of changes that were made.
   *
   * Example: if arr is {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}}
   * then this method modifies arr to be:
   * {{1, 0, 3, 0, 5}, {0, 7, 0, 9, 0}, {0, 0, 0, 3, 5}}
   * and returns 8 (the number of even numbers replaced by 0)
   *
   * POSTCONDITION: this method modifies the original 2D array referenced by arr
   *
   * @param arr 2D array of ints
   * @return the number of changes made
   */
  public static int replaceEvensWithZero(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] % 2 == 0) {
          arr[i][j] = 0;
          sum++;
        }
      }
    }
    return sum;
  }

  /**
   * Searches through the 2D array wordChart and finds all strings with
   * length len; these strings are added to an ArrayList and returned.
   * If no strings have that length, return an empty ArrayList
   *
   * @param wordChart 2D array of Strings
   * @parram len the length of strings to search for
   * @return an ArrayList containing all strings in wordChart with length len
   */
  public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
    ArrayList<String> found = new ArrayList<>();
    for (int i = 0; i < wordChart.length; i++) {
      for (int j = 0; j < wordChart[i].length; j++) {
        if (wordChart[i][j].length() == len) {
          found.add(wordChart[i][j]);
        }
      }
    }
    return found;
  }

  /**
   * calculates and returns the average class grade as a double for a
   * all Students in the 2D array seatingChart
   *
   * PRECONDITION: seatingChart contains at least one element with at least
   * one student (i.e. no need to worry about division by 0)
   * 
   * @param seatingChart 2D array of Student objects
   * @return the average grade of all Students in seatingChart, as a double
   */
  public static double classAverage(Student[][] seatingChart) {
    double sum = 0;
    int totalStudents = 0;
    for (int i = 0; i < seatingChart.length; i++) {
      totalStudents += seatingChart[i].length;
      for (int j = 0; j < seatingChart[i].length; j++) {
        sum += seatingChart[i][j].getGrade();
      }
    }
    return sum / totalStudents;
  }

  /**
   * Returns true if any two consecutive elements, horizontally or vertically,
   * are equal, false otherwise. You do not need to check for "wrap around"
   * consecutiveness, such as if the last element in a row is the same as
   * the first:
   * 
   * For example, if arr is:
   * 1, 2, 3, 4
   * 2, 7, 3, 5
   * 3, 4, 5, 6
   *
   * then this method returns true because there is a pair of consecutive
   * numbers (vertically)
   *
   * As another example, if arr is:
   * 1, 2, 3, 4
   * 2, 7, 8, 5
   * 3, 4, 4, 6
   *
   * then this method returns true because there is a pair of consecutive
   * numbers (horizontally)
   *
   * As another example, if arr is:
   * 1, 2, 3, 8
   * 2, 7, 8, 5
   * 3, 2, 5, 3
   *
   * then this method returns false because there are not two consecutive
   * numbers, vertically or horizontally, that are equal.
   *
   * NOTE: do not consider "wrap around" consecutive numbers, in other words,
   * the 3's and 6's below are not considered consecutive:
   * 1, 6, 3, 8
   * 2, 7, 8, 5
   * 3, 6, 5, 3
   *
   * Similarly, equal numbers on a diagonal are not considered consecutive,
   * so the 8's below are not consecutive:
   * 1, 2, 3, 8
   * 2, 7, 8, 5
   * 3, 2, 5, 3
   *
   * @param arr 2D array of ints
   */
  public static boolean consecutive(int[][] arr) {
    for (int row = 0; row < arr.length - 1; row++) {
      for (int i = 0; i < arr[row].length; i++) {
        if (arr[row][i] == arr[row + 1][i]) {
          return true;
        }
      }
    }

    for (int i = 0; i < arr.length; i++) {
      for (int col = 0; col < arr[i].length - 1; col++) {
        if (arr[i][col] == arr[i][col + 1]) {
          return true;
        }
      }
    }
    return false;
  }

  /** A "magic square" is a square grid filled with distinct integers such
   *  that each element is a different integer, and the sum of the integers
   *  in each row, column and diagonal is equal.  This method should return true
   *  if arr is a magic square.
   *
   *  PRECONDITION: arr is a square 2D array with the same number of rows and
   *                columns
   *  
   *  For example, if arr is:
   *      7, 2, 3
   *      0, 4, 8
   *      5, 6, 1
   *
   *  then this method returns true because each row, column, and diagonal add
   *  up to the same sum (12) and all numbers are unique (i.e. no duplicate
   *  values appear)
   *
   *  As another example, if arr is (note the 3 and 2 swapped):
   *      7, 3, 2
   *      0, 4, 8
   *      5, 6, 1
   *
   *  then this method returns false because the column sums no longer add up to
   *  the same value
   *
   *  As another example, if arr is:
   *      1, 2, 3
   *      2, 3, 1
   *      3, 1, 2
   *
   *  then this method returns false because, one diagonal does not sum to 6 and there are duplicate numbers.
   *
   *  @param arr  2D array of ints
   */
  public static boolean magicSquare(int[][] arr)
  {
    System.out.println("----" + t + "-----");
    t++;
    // A "magic square" is a square grid filled with distinct integers such
    //that each element is a different integer, and the sum of the integers
    //in each row, column and diagonal is equal.
    int sum = sumForRow(arr, 0);
    System.out.println(sum);
    for (int r = 1; r < arr.length; r++) {
      if (sum != sumForRow(arr, r)) {
        return false;
      }
    }
    int sum2 = sumForColumn(arr, 0);
    System.out.println(sum2);
    for (int c = 0; c < arr[0].length; c++) {
      if (sum2 != sumForColumn(arr, c)) {
        return false;
      }
    }
    int d1 = 0;
    for (int i = 0; i < arr.length; i++) {
      // System.out.println(arr[i][i]);
      d1 += arr[i][i];
    }
    System.out.println(d1);
    int d2 = 0;
    for (int i = 0; i < arr.length; i++) {
      // System.out.println(i + " what");
      // System.out.println(arr[i][arr.length - 1 - i]);
      d2 += arr[i][arr.length - 1 - i];
    }
    System.out.println(d2);
    if (d1 != d2 || d1 != sum2) {
      return false;
    }
    int first = arr[0][0];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i == 0 ? 1 : 0; j < arr[i].length; j++) {
        if (first == arr[i][j]) {
          return false;
        }
      }
    }
    return true;
  }
}