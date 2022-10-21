package org.example;

import java.util.Scanner;

public class Task7 {

    public class task7 {

        static void getCofee(int button) {
            switch (button) {
                case 1:
                    System.out.println("Приготовление эспрессо - минимально неразделимый процесс.");

                case 2 :
                    System.out.println("Приготовление американо - эспрессо + добавление воды.");

                case 3:
                    System.out.println("Приготовление капучино - эспрессо + добавление вспененного молока.");

                case 4:
                    System.out.println("Приготовление чая - выбор чайного пакетика + добавление воды.");

            }
        }

        public static void main(String[] args) {
            org.example.Task7 task7= new org.example.Task7();

            Scanner getCofee = new Scanner(System.in);
            Task7.task7.getCofee(new Scanner(System.in).nextInt());
        }
    }



}
