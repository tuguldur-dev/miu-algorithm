package Lab9;


public class Solution {
    public static void swap(int[] arr, int i, int j) {
        if (i == arr[0])      arr[0] = j;
        else if (j == arr[0]) arr[0] = i;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void initMinIndex(int[] arr, int n) {
        arr[0] = n / 2 + 1;
        for (int i = n / 2 + 2; i <= n; i++) {
            if (arr[i] < arr[arr[0]]) arr[0] = i;
        }
    }

    public static int getMinIndex(int[] arr, int n) {
        return arr[0];
    }

    public static int maxChildIndex(int[] arr, int j, int n) {
        int k = j;
        if (2 * j <= n && arr[2 * j] > arr[k])     k = 2 * j;
        if (2 * j + 1 <= n && arr[2 * j + 1] > arr[k]) k = 2 * j + 1;
        return (k == j) ? 0 : k;
    }

    public static void buildBottomUp(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            downHeap(arr, i, n);
        }
        initMinIndex(arr, n);
    }

    public static void heapsort(int[] arr, int n) {
        buildBottomUp(arr, n);
        for (int i = n; i >= 1; i--) {
            swap(arr, 1, i);
            downHeap(arr, 1, i - 1);
        }
    }

    public static void downHeap(int[] arr, int i, int n) {
        int j = i;
        int k = maxChildIndex(arr, j, n);
        while (k != 0) {
            swap(arr, j, k);
            j = k;
            k = maxChildIndex(arr, j, n);
        }
    }

    public static void buildTopDown(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            upHeap(arr, i);
        }
        initMinIndex(arr, n);
    }

    public static void upHeap(int[] arr, int i) {
        int j = i;
        while (j > 1 && arr[j / 2] < arr[j]) {
            swap(arr, j, j / 2);
            j = j / 2;
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        System.out.print("[ ");
        for (int i = 1; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {0, 9, 5, 8, 2, 0, 3, 4, 9, 1}; // arr[0] will hold minIndex
        int n = arr.length - 1;

        buildBottomUp(arr, n);
        System.out.print("Max-Heap:  ");
        printArray(arr);

        System.out.println("Min value: " + arr[getMinIndex(arr, n)] + " at index " + getMinIndex(arr, n));

        heapsort(arr, n);
        System.out.print("Sorted:    ");
        printArray(arr);
    }
}