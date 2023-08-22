package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int rsl = Max.max(left, right);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int expected = 5;
        int rsl = Max.max(left, right);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMax6To6Then6() {
        int left = 6;
        int right = 6;
        int expected = 6;
        int rsl = Max.max(left, right);
        assertThat(rsl).isEqualTo(expected);
    }
}