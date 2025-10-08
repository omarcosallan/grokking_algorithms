package main;

import java.util.Arrays;
import java.util.List;

public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println(recursiveSum(Arrays.asList(2, 4, 6)));
    }

    private static int recursiveSum(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return list.getFirst() + recursiveSum(list.subList(1, list.size()));
    }
}