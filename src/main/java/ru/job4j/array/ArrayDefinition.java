package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] age = new short[10];
        System.out.println("Размер массива равен: " + age.length);

        String[] surnames = new String[100500];
        System.out.println("Размер массива равен " + surnames.length);

        float[] prices = new float[40];
        System.out.println("Размер массива равен " + prices.length);

        String[] names = new String[4];
        names[0] = "Лалалэй";
        names[1] = "Котофей";
        names[2] = "Молофей";
        names[3] = "Бармалей";
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[0]);
        System.out.println(names[1]);
    }
}
