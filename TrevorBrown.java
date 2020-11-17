public class TrevorBrown {

    public static int[] randomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000000);
        }

        return arr;
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
        for (int i = 1000; i <= 10000; i += 1000) {
            printCell(i);
            printCell(InsertionSort.sort(randomArray(i)));

            System.out.printf("%n");
        }

    }
}