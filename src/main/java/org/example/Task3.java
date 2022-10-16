package org.example;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pls a hours: ");
        int currentHours = scanner.nextInt();

        System.out.println("Enter pls minutes: ");
        int currentMinutes = scanner.nextInt();

        int allSecondsInWorkDay = (17 - 9) * 60 * 60; // кол-во секунд в рабочем// дне
        System.out.println("All seconds " + allSecondsInWorkDay);


        int secondsLeft = ((currentHours - 9) * 60 + currentMinutes) * 60;
        System.out.println("Seconds left: " + secondsLeft);

        int deltaInSeconds = allSecondsInWorkDay - secondsLeft;

        System.out.println("Delta in second " + deltaInSeconds);
        System.out.println("Delat in minutes " + deltaInSeconds);
        System.out.println("Delta in hour " + deltaInSeconds);

        scanner.close();
    }
}

