package ru.job4j.calculator;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman180Then80dot5() {
        short in = 180;
        double expected = 80.5;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}