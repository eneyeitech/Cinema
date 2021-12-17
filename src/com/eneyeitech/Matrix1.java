package com.eneyeitech;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (d == 0) {
            System.out.println("division by zero!");
        } else if(b == 0 && c == 0) {

            System.out.println("division by zero!");
        }else {
            int result = a / ((b + c) / d);
            System.out.println(result);
        }
    }
}
