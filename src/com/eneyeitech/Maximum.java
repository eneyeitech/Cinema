package com.eneyeitech;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int r = 0,c = 0;

        int [][] matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    r = i;
                    c = j;
                }
            }}

        System.out.println(r+" "+c);
    }
}
