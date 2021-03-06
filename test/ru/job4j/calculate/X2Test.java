package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.X2;

public class X2Test {

    @Test
    public void whenA10B0C0X1Then10() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 1;
        int expected = 10;
        int rls = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rls);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected1 = 3;
       int rls = X2.calc(a, b, c, x);
        Assert.assertEquals(expected1, rls);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rls = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rls);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rls = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rls);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rls = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rls);
    }
}
