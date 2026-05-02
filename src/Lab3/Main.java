package Lab3;

public class Main {
    static void searchSS(int[][] array, int key) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] == key) {
                    IO.println(key + "=[" + i + ":" + k + "]");
                    return;
                }
            }
        }
        IO.println("Not found");
    }

    static void DACSearchRecursive(int[][] array, int rowStart, int rowEnd, int colStart, int colEnd, int key) {
        int midRow = (rowStart + rowEnd) / 2;
        int midCol = (colStart + colEnd) / 2;

        if (array[midRow][midCol] == key) {
            IO.println(key + "=[" + midRow + ":" + midCol + "]");
        } else if (array[midRow][midCol] < key) {
            DACSearchRecursive(array, midRow, rowEnd, midCol, colEnd, key);
        } else {
            DACSearchRecursive(array, rowStart, midRow, colStart, midRow, key);
        }
    }

    static void DACsearchSS(int[][] array, int key) {
        DACSearchRecursive(array, 0, array.length-1, 0, array.length-1, key);
    }


    static void M1(int n) {
        int[][] array = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n; k++) {
                array[i - 1][k] = n * i + k;
            }
        }
        print(array);
    }

    static void M2(int n) {
        int[][] array = new int[n][n];
        int size = n - 1;
        int number = n;
        int i, j;
        for (int d = 0; d <= size * 2; d++) {
            if (d <= size) {
                i = 0;
                j = d;
            } else {
                i = d - size;
                j = size;
            }

            while (i <= size && j >= 0) {
                if (d % 2 == 0) {
                    array[i][j] = number++;
                } else {
                    array[j][i] = number++;
                }
                i++;
                j--;
            }
        }
        print(array);
    }


    static void M3(int n) {
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 1; k <= n; k++) {
                array[i][k - 1] = n * k + i;
            }
        }

        print(array);
    }

    static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                IO.print(array[i][k] + " ");
            }
            IO.println();
        }

        searchSS(array, 23);
        DACsearchSS(array, 23);
        IO.println();
    }

    static void main() {
        int n = 5;
        M1(n);
        M2(n);
        M3(n);

    }
}
