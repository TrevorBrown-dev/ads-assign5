public class HibbardSort implements Sortable {
    public static int sort(int[] arr) {
        int count = 0;
        int j;
        for (int gap = arr.length / 2 - 1; gap > 0; gap = gap / 2 - 1) {

            for (int i = gap; i < arr.length; i++) {

                int temp = arr[i];
                for (j = i; j >= gap && temp < arr[j - gap]; j -= gap) {
                    arr[j] = arr[j - gap];
                    count++;
                }
                arr[j] = temp;
                // Might be unneccisary
                count++;
            }
        }
        return count;
    }
}
