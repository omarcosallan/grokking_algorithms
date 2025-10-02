public class Main {
    public static void main(String[] args) {
        int[] myList = {87, 21, 45, 93};

        System.out.println(binarySearch(myList, 93));
        System.out.println(binarySearch(myList, 16));
    }

    public static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}