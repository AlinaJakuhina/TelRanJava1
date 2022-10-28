package org.example;

public class Lesson26_10 {
    public static void main(String[] args) {

        for (int i = 0; i < 3 ; i++) {
            System.out.println("hello java via For loop");
        }

        int k = 0;
        while (k < 3){
            System.out.println("hello java via While loop");
            k++; // k = k + 1
        }

        int j = 0;
        do {
            System.out.println("hello java via DO-WHILE");
            j++; // j= j + 1
        } while (j < 3);


        int maxValue = 10;

        //For
        int sum_for = 0;

        for (int i = 0; i <= maxValue; i ++) {
            sum_for = sum_for + i;
        }
        System.out.println("Result from FOR loop: " + sum_for);


        // WHILE
        int sum_while = 0;
        int l = 0;
        while (l <= maxValue) {
            sum_while = sum_while + l;
            l++;
        }
        System.out.println("Result from WHILE loop: " + sum_while);

        // DO-WHILE
        int sum_do_while = 0;
        int m = 0;
        do {
            sum_do_while = sum_do_while + m;
            m++;
        } while (m <= maxValue);
        System.out.println("Result from DO-WHIlE: " + sum_do_while);
    }
}
