package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        RecursionExample rcs = new RecursionExample();
        System.out.println("Введите размерность массива");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();

        int[][] myArray = new int[x][x];
        rcs.arrayFill(myArray,  0, 0, 1, 0);



        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                System.out.print(myArray[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
