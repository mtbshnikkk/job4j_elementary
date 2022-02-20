package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    @Test
    public void when6() {
        int n = 6;
        int result = Factorial.calc(6);
        int expected = 720;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when0() {
        int n = 0;
        int result = Factorial.calc(0);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}
