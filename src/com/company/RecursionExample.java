package com.company;

public class RecursionExample {

    void arrayFill(int[][] arrayI,  int i, int j, int a, int n) {
        if (n == arrayI.length / 2) return;
        for (j = j; j < arrayI.length; j++) {
            if (arrayI[i][j] == 0) {
                arrayI[i][j] = a++;
            }
        }
        j = arrayI.length - (n + 1);
        for (i = i; i < arrayI.length; i++) {
            if (arrayI[i][j] == 0) {
                arrayI[i][j] = a++;
            }
        }
        i = arrayI.length - (n + 1);
        for (j = arrayI.length - (n + 1); j >= 0; j--) {
            if (arrayI[i][j] == 0) {
                arrayI[i][j] = a++;
            }
        }

        j=j+(n+1);
        for (i = arrayI.length - (n + 1); i >= 0; i--) {
            if (arrayI[i][j] == 0) {
                arrayI[i][j] = a++;
            }
        }
        n++;
        j++;
        i=i+(n+1);


        arrayFill(arrayI,  i, j, a, n);
    }
}



