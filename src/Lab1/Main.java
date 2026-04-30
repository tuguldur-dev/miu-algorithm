package Lab1;

public class Main {

    public static int Is123Array(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];

            if (c % 2 == 0) {
                counter++;
            }
            if (c % 3 == 0) {
                counter++;
            }
            if (c % 5 == 0) {
                counter++;
            }
            if (c % 2 != 0 && c % 3 != 0 && c % 5 != 0) {
                counter++;
            }
        }

        if (counter == arr.length) {
            return 1;
        }
        return 0;
    }

    public static int Is123ArrayOppisite(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];

            if (c % 6 == 0 || c % 10 == 0 || c % 15 == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] input = {2, 3, 5, 1};

        System.out.println(Is123Array(input));
        System.out.println(Is123ArrayOppisite(input));
    }
}