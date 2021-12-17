package com.eneyeitech;

public class Reverse {
    public static void reverseElements(int[][] twoDimArray) {
        int R = twoDimArray.length;
        int C = twoDimArray[0].length;
        // write your code here
        for (int i = 0; i < R; i++) {
            int start = 0;
            int end = C - 1;

            while(start < end){
                int temp = twoDimArray[i][start];
                twoDimArray[i][start] = twoDimArray[i][end];
                twoDimArray[i][end] = temp;

                start++;
                end--;
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] arr =
        { {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} };

        reverseElements(arr);
    }
}
