package org.example;

public class Task9 {
    public static void main(String[] args) {


       // int valueFloor = 163;


        int count = 0;

       for (int i = 0; i <= 163; count++){
       i = i + (5-1);
       }
       System.out.println("Добраться до самого верхнего этажа можно за " + count + "раз");


        int i1 = 0;
        int result = 0;

        while (i1 <= 163) {
            i1 = i1 + (5 - 1);
            result++;
        }
        System.out.println("Добраться до самого верхнего этажа можно за " + result + "раз");


        int i2 = 0;
        int result2 = 0;
        do {
            i2 = i2 + (5-1);
            result2++;
        } while (i2 <= 163);
        System.out.println("Добраться до самого верхнего этажа можно за " + result2 + "раз");

    }

}