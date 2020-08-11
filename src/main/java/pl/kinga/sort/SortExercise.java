package pl.kinga.sort;

import java.util.Arrays;

public class SortExercise {
    public static void main(String[] args) {
        int[] array = new int[]{4, 3, 8, 1};
        int[] sorted = sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] sort(int[] array) {
        int[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = i + 1, min = i; j < result.length; j++) {
                if (result[j] < result[min]) {
                    min = j;
                }
                swap(result, i, min);
            }
        }
        return result;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;
    }
}
