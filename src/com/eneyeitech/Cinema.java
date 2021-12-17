package com.eneyeitech;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        // Write your code here

        System.out.println("Cinema:");
        System.out.println("  1 2 3 4 5 6 7 8");
        for(int i = 1; i <= 7; i++){
            System.out.println(i+" S S S S S S S S");
        }
        Scanner scanner = new Scanner(System.in);
       /** System.out.println("Enter the number of rows:");
        int rows =  Integer.parseInt(scanner.next());
        System.out.println("Enter the number of seats in each row:");
        int seats = Integer.parseInt(scanner.next());
        int total = rows * seats;
        int price;
        if(total < 61){
            price = total * 10;
        }else{
            int frontHalf = rows / 2;
            int backHalf = rows - frontHalf;
            price = (frontHalf * seats * 10)+(backHalf * seats * 8);
        }
        System.out.printf("Total income:\n$%d",price);
*/
        var n = scanner.nextInt();
        int k = n / 2;
        String[][] arr = new String[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i==j){
                    arr[i][j] = "* ";
                }else if(i==n-j-1){
                    arr[i][j] = "* ";
                }else{
                    arr[i][j] = ". ";
                }
            }
        }

        for(int i = 0; i < n; i++){
            arr[k][i] = "* ";
        }
        for(int i = 0; i < n; i++){
            arr[i][k] = "* ";
        }

        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
