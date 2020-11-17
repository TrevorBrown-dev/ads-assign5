public class InsertionSort implements Sortable {
    public static int sort(int[] arr) {
        int comparisons = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                comparisons++;
                if (arr[j] < arr[j - 1]) {
                    Utils.swap(arr, j, j - 1);
                } else
                    break;

            }
        }
        return comparisons;
    }
}
