package org.example;

import java.util.Arrays;
import java.util.Random;

public class Person {
    public static void main(String[] args) {

        //    clone arrays

//        int[] a = {99,22,12,34,23};
//        int[] b = a.clone();
//
//        System.out.println("Array a = " + Arrays.toString(a));
//        System.out.println("Arrays b = " + Arrays.toString(b));
//
//        b[1] = 1000;
//
//        System.out.println("Array a = " + Arrays.toString(a));
//        System.out.println("Array b = " + Arrays.toString(b));

//
//        //copyOf
//        int[] q = {99,22,13,34,23,18,45,55,24,12};
//        int [] b = Arrays.copyOf(q,4);
//
//
//        System.out.println(Arrays.toString(q));
//        System.out.println(Arrays.toString(b));

        // copyOfRange
//        int[] a = {99,22,12,34,23,8,23,11,10,98,99,45};
//        int[] b = Arrays.copyOfRange(a,1,10);
//
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));


//        // sort
//        int[] a = {99, 22, 12, 34, 23, 8, 23, 11, 10, 98, 99, 45};
//
//        System.out.println("Before sorting " + Arrays.toString(a));
//
//        Arrays.sort(a);
//
//        System.out.println("After sorting " + Arrays.toString(a));

// Создать массив типа String с размером 7.Записать в него значения дней недели.
// Используя Random класс выбрать случайный день недели.

//        String[] week = new String[]{"mon", "tue", "we", "th", "fr", "sa", "su"};
//
//        Random r = new Random();
//        int index = r.nextInt(7);
//        System.out.println(index);


//        Создайте массив из всех нечётных чисел от 1 до 99.
//        Выведите его на экран в строку в обратном порядке.

//        int lenghtOfArr = 0;
//        for (int i = 1; i <= 99; i++) {
//            if (i % 2 != 0)
//                lenghtOfArr++;
//        }
//
        int lenghtOfArr = 5;
        int[] result = new int[lenghtOfArr];

        int currentValue = 1;
        for (int i = lenghtOfArr - 1; i >= 5; currentValue += 2) {
            result[i] = currentValue;
        }

        System.out.println(Arrays.toString(result));
//   }


//    Person person1 = new Person("Bob Morley");
//    Person person2 = new Person("Lady Gaga");
//    Person person3 = new Person("Justin Timberlake");
//
//    Person[] arrayOfPersons = new Person[3];
//
//    public Person(String lady_gaga) {
//
//    }

//    System.out.println(Arrays.toString(arrayOfPersons));
        //       for (int i = 0; i < arrayOfPersons.length; i++) {
        //           System.out.println(arrayOfPersons[i].getName());


//    clone
//        int[] a = {99, 22, 12, 34, 23};
//        int[] b = a;


    }

}