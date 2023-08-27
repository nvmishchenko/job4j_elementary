package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {2, 3, 1};
        int[] expected = new int[] {1, 2, 3};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {2, 3, 1, 8, 6};
        int[] expected = new int[] {1, 2, 3, 6, 8};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }
}