package org.example;

public class Primeri {
    String name;
    int age;
    Ball ball;

    /**  Тип данных   имя(ссылка на объект)  = создание объекта    конструктор
     *     Person     person                 =      new            Person();
     */

    public Primeri(String name, int age, Ball ball) {
        this.name = name;
        this.age = age;
        this.ball = ball;
    }

    public Primeri(int age, Ball ball) {
        this.age = age;
        this.ball = ball;
    }

    public Primeri() {
    }

    void getSmth() {
        System.out.println("!!!!!");
    }

    public static void main(String[] args) {
        Primeri person1
                = new Primeri();
        person1.getSmth();
    }

    }

