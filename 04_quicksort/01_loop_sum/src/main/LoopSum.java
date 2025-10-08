package main;

import java.util.Arrays;
import java.util.List;

public class LoopSum {

    public static void main(String[] args) {
        System.out.println(loopSum(Arrays.asList(2, 4, 6)));
    }

    private static int loopSum(List<Integer> list) {
        int total = 0;
        for (int x : list) {
            total += x;
        }
        return total;
    }
}
