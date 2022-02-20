package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

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