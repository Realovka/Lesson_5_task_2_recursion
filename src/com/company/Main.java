package com.company;


import java.util.Scanner;

import static com.company.RecursionExample.arrayFill;

public class Main {

    // заполнение массива змейкой через рекурсию
    public static void main(String[] args) {

        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int[][] myArray = new int[x][x];

        arrayFill(myArray, 0, 0, 1, 0);


        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i][j] == 0) {
                    myArray[i][j] = x * x;
                }
            }
        }
                for (int i = 0; i < myArray.length; i++) {
                    for (int j = 0; j < myArray.length; j++) {
                        System.out.print(myArray[i][j] + "  ");
                    }
                    System.out.println();
                }

            }
        }
