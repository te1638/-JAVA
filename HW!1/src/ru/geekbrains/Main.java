package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
        byte one = 127;
        short two = 32767;
        int three = 10090;
        long four = 120;
        float five = 1234.2f;
        double dbl = 1.2D;
        char e = 'c';
        boolean yes = true;
        boolean no = false;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(dbl);
        System.out.println(e);
        System.out.println(yes);
        System.out.println(no);

        float a = 5;
        float b = 10;
        float c = 15;
        float d = 20;
        float calculate = (a * (b + (c / d)));
        System.out.println(calculate);


        int x1 = 11;
        int x2 = 7;
        boolean task10and20;
        {
            if (x1 + x2 < 10 || x1 + x2 > 20) {
                task10and20 = false;
            } else {
                task10and20 = true;
            }
            System.out.println(task10and20);

        }
        int x = 0;
        int isPositiveOrNegative = x;
        {
            if (isPositiveOrNegative <= 0) {
                System.out.println("Число отрицательное");
            } else {
                System.out.println("Число положительное");
            }
        }
        boolean isNegative;
        {
            if (x <= 0) {
                isNegative = true;
            } else {
                isNegative = false;
            }
            System.out.println(isNegative);
        }
        greetings("name");
    }

    public static void greetings(String name) {
        System.out.println("Привет, " + name);

    }



}








