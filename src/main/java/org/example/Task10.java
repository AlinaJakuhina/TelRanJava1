package org.example;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {

        int[] Arr = new int[15];
        int a = 0;

        for (int i = 0; i < Arr.length; i++) {
            Random abv = new Random();
            Arr[i] = abv.nextInt(10);
            System.out.println(Arr[i] + " ");
            if (Arr[i] > 0 & Arr[i] % 2 == 0)a++;
            }
        System.out.println(" ");
        System.out.println("Всего в массиве "+a+" четных");
        }
    }

