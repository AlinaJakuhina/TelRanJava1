package org.example;

import java.util.Scanner;

import static java.lang.System.in;

public class Task1 {

    public class Main {
        public static void main(String[] args) {
               Scanner scanner = new Scanner(in);

              int a = scanner.nextInt();
             System.out.println("The area of a circle with radius [" + a + "] is " + ( 3.14 * a * a ));


               System.out.print("Укажите своё имя:");
               String name = scanner.nextLine();
                 System.out.println("Hello " + name);

             String test = "I study Basic Java!";
               System.out.println(test);
               System.out.println(test.length());
               System.out.println(test.charAt(18));

               String value = "I study Basic Java!";
               String a1 = "*";
               String target = "a";
               System.out.println(value.replace("a","*"));

        }
    }



}
