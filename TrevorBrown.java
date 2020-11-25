public class TrevorBrown {

    public static int[] randomArray(int size, int range) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range);
        }

        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void printCell(int n) {
        printCell(n + "");
    }

    public static void printCell(String s) {
        int padding = 14;
        System.out.printf("%-" + padding + "s", s);
    }

    public static void main(String[] args) {

        printCell("N");
        printCell("Insertion");
        printCell("Shell");
        printCell("Hibbard");
        printCell("Knuth");
        printCell("Gonnet");
        printCell("Sedgewick");
        printCell("Heapsort");
        printCell("Mergesort");
        printCell("Quicksort");
        printCell("NlogN");
        System.out.printf("%n");
        int range = 100000;
        for (int i = 1000; i <= 10000; i += 1000) {
            printCell(i);
            printCell(InsertionSort.sort(randomArray(i, range)));
            printCell(ShellSort.sort(randomArray(i, range)));
            printCell(HibbardSort.sort(randomArray(i, range)));
            printCell(KnuthSort.sort(randomArray(i, range)));
            printCell(GonnetSort.sort(randomArray(i, range)));
            printCell(SedgewickSort.sort(randomArray(i, range)));
            printCell(HeapSort.sort(randomArray(i, range)));
            printCell(MergeSort.sort(randomArray(i, range)));
            printCell(QuickSort.sort(randomArray(i, range)));
            printCell((int) Math.floor(i * (Math.log10(i) / Math.log10(2))));

            System.out.printf("%n");
        }

    }
}