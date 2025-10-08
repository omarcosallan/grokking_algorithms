package main;

import java.util.Arrays;
import java.util.List;

public class RecursiveMax {
    public static void main(String[] args) {
        System.out.println(recursiveMax(Arrays.asList(3, 4, 23, 0, 1, 20, 5, 7, 10, 0)));
    }

    private static int recursiveMax(List<Integer> list) {
        if (list.size() <= 2) {
            return list.get(0) > list.get(1) ? list.get(0) : list.get(1);
        }
        int max = recursiveMax(list.subList(1, list.size()));
        return max > list.get(0) ? max : list.get(0);
    }
}