/*
 * Mergesort impl in Java.
 * Input: An array over integers that has to be sorted
 * Output: Sorted Array over integers
 */

public class MergeSort {

    public static void mergeSort(int[] arrToSort, int n) {

        if (n < 2) {
            return;
        }

        // Find the middle point to divide the array into two halves
        int mid = n / 2;

        // Divide the payload
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arrToSort[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = arrToSort[i];
        }

        // Call mergeSort for first half
        mergeSort(left, mid);
        // Call mergeSort for second half
        mergeSort(right, n - mid);
        // Merge the two halves sorted
        merge(arrToSort, left, right, mid, n - mid);
    }

    public static void merge(int[] arrToSort, int[] left, int[] right, int lbound, int rbound) {

        int i = 0, j = 0, k = 0;

        while (i < lbound && j < rbound) {
            if (left[i] <= right[j]) {
                arrToSort[k++] = left[i++];
            }
            else {
                arrToSort[k++] = right[j++];
            }
        }

        while (i < lbound) {
            arrToSort[k++] = left[i++];
        }

        while (j < rbound) {
            arrToSort[k++] = right[j++];
        }
    }
}