package main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Quicksort {
    public static void main(String[] args) {
        System.out.println(quicksort(Arrays.asList(10, 5, 2, 3)));
    }

    private static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            // base case
            return list;
        } else {
            // recursive case
            // get first element
            int pivot = list.getFirst();

            // skip first element
            // sub-array of all the elements less than the pivot
            List<Integer> less = list.stream().skip(1).filter(x -> x <= pivot).toList();

            // skip first
            // sub-array of all the elements greater than the pivot
            List<Integer> greater = list.stream().skip(1).filter(x -> x > pivot).toList();

            return Stream.of(
                    quicksort(less).stream(),
                    Stream.of(pivot),
                    quicksort(greater).stream()
            ).flatMap(Function.identity()).toList();
        }
    }
}