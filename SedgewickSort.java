
public class SedgewickSort implements Sortable {
    public static int sort(int[] a) {
        int count = 0;
        int l = 0;
        int r = a.length - 1;
        int i, j, k, h;
        int[] incs = { 1391376, 463792, 198768, 86961, 33936, 13776, 4592, 1968, 861, 336, 112, 48, 21, 7, 3, 1 };

        for (k = 0; k < 16; k++)
            for (h = incs[k], i = l + h; i <= r; i++) {
                int v = a[i];
                j = i;
                while (j >= h && a[j - h] > v) {
                    a[j] = a[j - h];
                    j -= h;
                    count++;
                }
                a[j] = v;
            }
        return count;
    }
}
