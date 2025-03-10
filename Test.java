import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
      //{1, 2, 3},
      //{2, 3, 1}, 
      //{3, 1, 2}
      // c1 = 6
      // r1 = 6
      // d1 = 9
      // d2 = 9
      int[][] testArr1 = {{7, 2, 3}, {0, 4, 8}, {5, 6, 1}};
int[][] testArr2 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
int[][] testArr3 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 15}};
int[][] testArr4 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 17, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};
int[][] testArr5 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 15}, {14, 4, 1, 6}};
int[][] testArr6 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 8}};
int[][] testArr7 = {{7, 3, 2}, {0, 4, 8}, {5, 6, 1}};
int[][] testArr8 = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
int[][] testArr9 = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
int[][] testArr10 = {{0, 4, 8}, {7, 2, 3}, {5, 6, 1}};
int[][] testArr11 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 26, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, -6, 10, 22, 25}};
int[][] testArr12 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 27, 13, -1, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};;
int[][] testArr13 = {{1, 2, 9}, {4, 15, -7}, {7, -5, 10}};
int[][] testArr14 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 5}};



boolean test1 = Algorithm2DArrays.magicSquare(testArr1);
System.out.println(test1);
boolean test2 = Algorithm2DArrays.magicSquare(testArr2);
System.out.println(test2);
boolean test3 = Algorithm2DArrays.magicSquare(testArr3);
System.out.println(test3);
boolean test4 = Algorithm2DArrays.magicSquare(testArr4);
System.out.println(test4);
boolean test5 = Algorithm2DArrays.magicSquare(testArr5);
System.out.println(test5);
boolean test6 = Algorithm2DArrays.magicSquare(testArr6);
System.out.println(test6);
boolean test7 = Algorithm2DArrays.magicSquare(testArr7);
System.out.println(test7);
// TEST 8 AND 9
boolean test8 = Algorithm2DArrays.magicSquare(testArr8);
System.out.println(test8);
boolean test9 = Algorithm2DArrays.magicSquare(testArr9);
System.out.println(test9);
boolean test10 = Algorithm2DArrays.magicSquare(testArr10);
System.out.println(test10);
boolean test11 = Algorithm2DArrays.magicSquare(testArr11);
System.out.println(test11);
boolean test12 = Algorithm2DArrays.magicSquare(testArr12);
System.out.println(test12);
boolean test13 = Algorithm2DArrays.magicSquare(testArr13);
System.out.println(test13);
boolean test14 = Algorithm2DArrays.magicSquare(testArr14);
System.out.println(test14);
if (test1 && test2 && test3 && test4 && !test5 && !test6 && !test7 && !test8 && !test9 && !test10 && !test11 && !test12 && !test13 && !test14) {
    System.out.println("\n--- ALL TESTS PASS! ---");
} else {
    System.out.println("\n!!!!!! TEST FAIL!!!!!!!");
}
    }
}