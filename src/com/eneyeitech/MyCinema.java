package com.eneyeitech;

import java.util.Scanner;

public class MyCinema {
    public static String[][] cinemaSeats;
    public static Scanner scanner;
    public static int seatNo;
    public static int rowNo;
    public static int ticketPurchasedCount;
    public static int totalEarnings;
    public static int possibleEarnings;
    public static float percentageEarnings;
    public static int totalSeats;

    public static void main(String[] args){
        // Write your code here
        scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows =  scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        cinemaSeats = new String[rows][seats];
        totalSeats = rows * seats;
        populateSeats();
        int opt;
        do{
            System.out.println("1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit\n");

            opt = scanner.nextInt();

            switch(opt){
                case 1:
                    printSeats(seats);
                    break;
                case 2:
                    bookSeat(rows, seats);

                    break;
                case 3:
                    calculateTotal(rows, seats);
                    showStatistics();
                case 0:
                    break;

            }

        }while(opt != 0);

    }

    public static void populateSeats(){
        for (int i = 0; i < cinemaSeats.length; i++) {
            for (int j = 0; j < cinemaSeats[i].length; j++) {
                cinemaSeats[i][j] = " S";}}
    }

    public static void bookSeat(int rows, int seats){

        boolean pass = false;
        do {
            System.out.println("Enter a row number:");
            rowNo = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNo = scanner.nextInt();
            if (rowNo - 1 < 0 || rowNo - 1 > cinemaSeats.length - 1) {
                System.out.println("Wrong input!");
            } else if (seatNo - 1 < 0 || seatNo - 1 > cinemaSeats[0].length - 1) {
                System.out.println("Wrong input!");
            } else {
                String s = cinemaSeats[rowNo - 1][seatNo - 1];
                if (" S".equalsIgnoreCase(s)) {
                    cinemaSeats[rowNo - 1][seatNo - 1] = " B";
                    calculatePrice(rows, seats);
                    ticketPurchasedCount++;
                    pass = true;
                } else {
                    System.out.println("That ticket has already been purchased!");
                }
            }
        }while(!pass);
    }

    public static void calculatePrice(int rows, int seats){
        int total = rows * seats;
        int price;
        if(total < 61){
            price = 10;
        }else{
            int frontHalf = rows / 2;
            System.out.println("HH "+frontHalf);
            System.out.println("MM "+rowNo);
            if(rowNo <= frontHalf){
                price = 10;
            }else{
                price = 8;
            }

        }
        totalEarnings += price;
        System.out.printf("Ticket price: $%d\n",price);
    }

    public static void printSeats(int col){
        System.out.println("Cinema:");

        String colsS = " ";
        for (int i = 0; i < col; i++) {
            colsS += " " + (i+1);
        }
        System.out.println(colsS);
        for (int i = 0; i < cinemaSeats.length; i++) {
            System.out.print(i+1);
            for (int j = 0; j < cinemaSeats[i].length; j++) {
                System.out.print(cinemaSeats[i][j]);
            }
            System.out.println();
        }
    }

    public static void calculateTotal(int rows, int seats){
        int total = rows * seats;
        int price;
        if(total < 61){
            price = total * 10;
        }else{
            int frontHalf = rows / 2;
            int backHalf = rows - frontHalf;
            price = (frontHalf * seats * 10)+(backHalf * seats * 8);
        }
        possibleEarnings = price;
        //System.out.printf("Total income:\n$%d",price);
    }

    public static void showStatistics(){
        System.out.printf("count: %d - total-seats: %d\n", ticketPurchasedCount, totalSeats);
        percentageEarnings = ((float)ticketPurchasedCount / (float)totalSeats) * 100;
        System.out.printf("\nNumber of purchased tickets: %d\n" +
                "Percentage: %.2f%%\n" +
                "Current income: $%d\n" +
                "Total income: $%d\n", ticketPurchasedCount, percentageEarnings, totalEarnings, possibleEarnings);
    }
}
