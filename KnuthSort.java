public class KnuthSort implements Sortable {
    public static int sort(int[] arr) {
        int count = 0;
        int inner, outer;
        int temp;
        int h = 1;
        while (h <= arr.length / 3)
            h = h * 3 + 1;

        while (h > 0) {
            for (outer = h; outer < arr.length; outer++) {
                temp = arr[outer];
                inner = outer;
                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    count++;
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        return count;
    }
}
