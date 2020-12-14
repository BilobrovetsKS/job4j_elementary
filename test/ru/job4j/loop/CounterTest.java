package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
        public void whenSumEvenNumbersFromOneToTenThenThirty () {
            int rsl = Counter.sumByEven(1, 10);
            int expected = 30;
            assertThat(rsl, is(expected));
        }

    @Test
    public void whenSumEvenNumbersFromEightToTwentyThenNinetyEight () {
        int rsl = Counter.sumByEven(8, 20);
        int expected = 98;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromZeroToOneThenZero () {
        int rsl = Counter.sumByEven(0, 1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }
    }
