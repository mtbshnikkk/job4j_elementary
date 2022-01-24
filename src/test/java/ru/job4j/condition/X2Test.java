package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
        int rsl = X2.calc(1, 1, 1, 1);
        int expected = 3;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int rsl = X2.calc(0, 1, 1, 1);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int rsl = X2.calc(1, 1, 0, 1);
        int expected = 2;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int rsl = X2.calc(1, 1, 1, 0);
        int expected = 1;
        Assert.assertEquals(expected, rsl);
    }
}