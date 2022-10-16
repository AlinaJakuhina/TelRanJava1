package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        //    boolean isWeekend;
        //    boolean isRain;

        Scanner scanner = new Scanner(System.in);
        boolean isWeekend = scanner.nextBoolean();

        Scanner scanner1 = new Scanner(System.in);
        boolean isRain = scanner1.nextBoolean();

        boolean isWeekend1 = true;
        boolean isRain1 = false;


        if (isWeekend1 == true && isRain1 == false) {
            boolean canWalk = true;
            System.out.println("canWalk = " + canWalk);
        } else {
            boolean canWalk = false;
            System.out.println("canWalk = " + canWalk);
        }
    }
}