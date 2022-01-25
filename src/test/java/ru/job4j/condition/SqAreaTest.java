package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP15K3Square10dot54() {
        double expected = 10.54;
        int p = 15;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1000K10Square20661dot15() {
        double expected = 20661.15;
        int p = 1000;
        double k = 10;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}