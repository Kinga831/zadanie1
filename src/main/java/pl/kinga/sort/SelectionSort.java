package pl.kinga.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {4, 5, 8, 1};
        System.out.println(Arrays.toString(array));
        int[] sorted = sort(array);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] sort(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int indexOfCurrentMaximumValue = findIndexOfMaximumValue(array);
            result[i] = array[indexOfCurrentMaximumValue];
            array[indexOfCurrentMaximumValue] = 0;
        }
        return result;
    }

    private static int findIndexOfMaximumValue(int[] array) {
        int indexOfCurrentMaximumValue = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > array[indexOfCurrentMaximumValue]) {
                indexOfCurrentMaximumValue = j;
            }
        }
        return indexOfCurrentMaximumValue;
    }
}
