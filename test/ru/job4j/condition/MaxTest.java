package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1to2to3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3to2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2to2to5Then5() {
        int result = Max.max(2, 2, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax2to2to5to3Then5() {
        int result = Max.max(2, 2, 5, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax2to2to5to10Then10() {
        int result = Max.max(2, 2, 5, 10);
        assertThat(result, is(10));
    }
}