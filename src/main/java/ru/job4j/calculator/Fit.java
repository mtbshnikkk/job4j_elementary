package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 183;
        double man = manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man 183 is " + man);
        System.out.println("Woman 183 is " + woman);

    }
}
