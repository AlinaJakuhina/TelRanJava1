package org.example;

import java.util.Scanner;

public class Lesson17_10 {
    public static void main(String[] args) {
        int i = 20;

        if (i > 15) {
            System.out.println(i + " > 15");
        } else {
            System.out.println(i + " < 15");
        }

        if (i == 10) {
            System.out.println("i == 10");
        } else if (i == 15) ;
        {
            System.out.println("i == 15");
        }

    }

    public class Main {
        public static void main(String[] args) {

            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            //  index  0 1 2 3 4 5 6 7 8

//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 5)
//                break;
//            System.out.println(a[i]);
//        }

//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                continue;
//            }
//            System.out.println(a[i] + " ");
//        }

//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 5) {
//                return;
//            }
//            System.out.println(a[i]);
//        }
//
//        System.out.println("hello");
            Scanner scanner = new Scanner(System.in);
            int temperature = scanner.nextInt();
            String tempCondition;

            if (temperature > 100)
                tempCondition = "Пар";
            else
                tempCondition = "Вода";

            System.out.println(tempCondition);

            scanner.close();

        }

        static int test(int x) {

            int local = 0;

            if (x > 0) {
                local = x;
            } else {
                local = 1;
            }

            return local;
        }
    }
}