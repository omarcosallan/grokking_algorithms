import java.util.Arrays;
import java.util.List;

public class RecursiveCount {
    public static void main(String[] args) {
        System.out.println(recursiveCount(Arrays.asList(1, 2, 3, 4, 5)));
    }

    private static int recursiveCount(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return 1 + recursiveCount(list.subList(1, list.size()));
    }
}