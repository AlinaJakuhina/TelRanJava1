package org.example;

public class Task2 {
    public class home {public class task {
        public static void main (String[] args) {


            //Scanner scanner = new Scanner(System.in);
            // String name = "privet";
            // System.out.println(name);


            int x = 4;
            int y = 2;
            System.out.println(x + y);

            int a = 2;
            int b = 8;
            System.out.println(a * b);

            int w = 20;
            int e = 10;
            System.out.println(w - e);

            int z = 20;
            int v = 10;
            System.out.println(z / v);


            System.out.println(convertEurToUsd(10, 0.97));
            System.out.println(convertEurToUsd(10, 0.97));
        }
        public static double convertEurToUsd(int eur, double course) {
            return eur * course;
        }

    }

    }

}
