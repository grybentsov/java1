package ru.geekbrains.lesson_01;

public class Lesson_01 {

    public static void main(String[] args) {
        System.out.println(arythmetic(17, 27, 38, 65, 54));
        System.out.println(sumCheck(9, 12));
        numberCheck(-63);
        greetings("Боб");
        leapYearOrNot(2020);
    }
    // Task 1
    public static float arythmetic (int a, int b, int c, int d){
        float result = 0.0;
        return result = a * (b + (c / d));

    }
    // Task 2
    public static boolean sumCheck (int k, int m){
        int sum = 0;
        sum = k + m;
        if (sum >= 10 && sum <= 20){
            return true;
        } else {
            return false;
        }
    // Task 3
        public static void numberCheck (int n){
            if (n < 0) {
                System.out.println("Вы ввели отрицательное число");
            } else {
                System.out.println("Вы ввели положительное число");
            }

            // Task 4
            public static void greetings(String name) {
                System.out.println("Привет, " + name + " !");
            }

            // Task 5
            public static void leapYearOrNot (int year){
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("Этот год високосный");
                } else {
                    System.out.println("Этот год не является високосным");
                }
            }
        }