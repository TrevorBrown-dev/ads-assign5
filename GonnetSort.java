public class GonnetSort implements Sortable {
    public static int sort(int[] arr) {
        int count = 0;
        int j;
        for (int gap = (int) (arr.length / 2.2); gap > 0; gap = (int) ((gap + 1) / 2.2)) {

            for (int i = gap; i < arr.length; i++) {

                int temp = arr[i];
                for (j = i; j >= gap && temp < arr[j - gap]; j -= gap) {
                    arr[j] = arr[j - gap];
                    count++;
                }
                arr[j] = temp;
                // Might be unneccisary
                // count++;
            }
        }
        return count;
    }
}
