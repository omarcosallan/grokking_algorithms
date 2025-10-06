package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]
    }

    // O(n * n) => O(n^2)
    private static List<Integer> selectionSort(List<Integer> arr) {
        int size = arr.size();
        List<Integer> newArr = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);
            newArr.add(arr.remove(smallest));
        }

        return newArr;
    }

    private static int findSmallest(List<Integer> arr) {
        int smallestIndex = 0;
        int smallest = arr.get(smallestIndex);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
