package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int expected = 1;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }
}