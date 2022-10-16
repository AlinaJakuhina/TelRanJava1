package org.example;

public class Lesson12_10 {
    public static void main(String[] args) {

    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;

        System.out.println(" --- Arithmetic operators --- ");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println(" --- Unary operators --- ");
        System.out.println("U(+) " + (+a));
        System.out.println("U(-) " + (-a));
        System.out.println("U(˜) " + (~a));

        System.out.println(Integer.toBinaryString(a));
    //1010 (Binary) <- 10 (Decimal)
    // 00000000 00000000 00000000 00001010 (Binary) <- 10 (Decimal)
    // U(˜)
    // 11111111 11111111 11111111 11110101(Binary)

    // int y = 0b11111111 11111111 11111111 11110101;
    // System.out.println("Checking " + y );

        System.out.println("++U "+ (++a));
        System.out.println("--U " + (--a));

        System.out.println("U++ " + (a++));
        System.out.println("New value of a = " + a);

        System.out.println("U-- " + (a--));
        System.out.println("New value of a = " + a);


        System.out.println(" --- Relations operators --- " );
        System.out.println("R (a == b) " + (a == b));
        System.out.println("R (a != b) " + (a != b));
        System.out.println("R (a < b) " + (a < b));
        System.out.println("R (a > b) " + (a > b));
        System.out.println("R (a <= b) " + (a <= b));
        System.out.println("R (a >= b) " + (a >= b));


        System.out.println(" --- Logic operators --- "); // AND && cond1 && cond2 возвращает true, когда оба cond1 и cond2 истинны
    // boolean a_b = a < b; //a=10 b=20
    //  boolean c_d = c < d; //c=30 d=40
    //  System.out.println(a_b && c_d);
        System.out.println(a < b && c < d);
        System.out.println("L(AND &&) " + (a < b && c > d));

// OR ||
        // Если хотя бы один из двух дает истину, оператор возвращает истину.
        // Чтобы результат был ложным, оба условия должны возвращать false.
        System.out.println("L(OR ||) " + (a < b || c < d));
        System.out.println("L(OR ||) " + (a < b || c > d));

        // NOT !
        // Если условие ложно, операция возвращает истину, а когда условие истинно,
        // операция возвращает ложь.
        System.out.println("L(NOT !) " + !(a < b));
        System.out.println("L(NOT !) " + !(c > d));

    //Mixing
        System.out.println((a < b) && (c < d) || !(a > b));

        System.out.println(" --- Bits operators --- " );
        // Bit and &. Равно 1, если соответствующие биты в операндах также равны 1.
        // Во всех остальных случаях значение результирующего бита равно 0
        System.out.println("B(AND &) " + (a & b));

        // System.out.println("Binary a = " + Integer.toBinaryString(a));
        // System.out.println("Binary b = " + Integer.toBinaryString(b));

        // 00000000 00000000 00000000 00001010 <- a=10
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit AND &
        // 0000000 000000000 00000000 00000000 <- 0

        // Bit OR |. Равно 1, если соответствующий бит в любом из операндов равен 1
        System.out.println("B(OR |) " + (a | b));
        // 00000000 00000000 00000000 00001010 <- a=10
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit OR |
        // 00000000 00000000 00000000 00011110 <- 30

        // Bit XOR ^. Равно 1, если соответствующий бит только в одном из операндов
        // равен 1. Во всех других случаях результирующий бит равен 0
        System.out.println("B(XOR ^) " + (a ^ b));
        // 00000000 00000000 00000000 00001010 <- a=10
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit XOR ^
        // 00000000 00000000 00000000 00011110 <- 30

        int w = -1;
        System.out.println("B(AND &, w, b) " + (w & b));
        // 11111111 11111111 11111111 11111111 <- w=-1
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit AND &
        // 0000000 000000000 00000000 00010100 <- 20

        System.out.println("B(OR |, w, b) " + (w | b));
        // 11111111 11111111 11111111 11111111 <- w=-1
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit OR |
        // 11111111 11111111 11111111 11111111 <- -1

        System.out.println("B(XOR ^, w, b) " + (w ^ b));
        // 11111111 11111111 11111111 11111111 <- w=-1
        // 00000000 00000000 00000000 00010100 <- b=20
        // Bit XOR ^
        // 11111111 11111111 11111111 11101011 <- -21

        // &      |      ^
        // 101    101    101   <- one
        // 011    011    011   <- two
        // 001    111    110   <- res

        System.out.println(" --- Bit shift operators --- " );
        System.out.println("BS (a << 2) " + (a << 2));
        // 00000000 00000000 00000000 00001010 <- a=10
        // << 2 bit
        // 00000000 00000000 00000000 00101000 <- 40

        System.out.println("BS (a >> 2) " + (a >> 2));
        // 00000000 00000000 00000000 00001010 <- a=10
        // << 2 bit
        // 00000000 00000000 00000000 00000010 <- 2

        System.out.println("BS (a >>> 2) " + (a >>> 2));
    }

}

