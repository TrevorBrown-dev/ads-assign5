public class KnuthSort implements Sortable {
    public static int sort(int[] arr) {
        int count = 0;
        int inner, outer;
        int temp;
        // find initial value of h
        int h = 1;
        while (h <= arr.length / 3)
            h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)

        while (h > 0) // decreasing h, until h=1
        {
            // h-sort the file
            for (outer = h; outer < arr.length; outer++) {
                temp = arr[outer];
                inner = outer;
                // one subpass (eg 0, 4, 8)
                while (inner > h - 1 && arr[inner - h] >= temp) {
                    arr[inner] = arr[inner - h];
                    count++;
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h - 1) / 3; // decrease h
        }
        return count;
    }
}
