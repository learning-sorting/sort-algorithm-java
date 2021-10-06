import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void should_evaluate_to_true() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Array before applying mergesort: " + Arrays.toString(actual));
        MergeSort.mergeSort(actual, actual.length);
        System.out.println("Array after applying mergesort: " + Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}
