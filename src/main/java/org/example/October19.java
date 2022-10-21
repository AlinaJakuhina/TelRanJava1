package org.example;

public class October19 {

    public static class Person {

        private String name;
        private int age;
        private int salary;

        public Person(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getSalary() {
            return salary;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }


        public static void main(String[] args) {
            Person person = new Person("Nata",44, 5000);
            Person person1 = new Person("Alina",32,6000);

            System.out.println(person1);

        }
    }
}
