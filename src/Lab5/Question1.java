package Lab5;

import java.util.Arrays;

public class Question1 {
    static void twoColorBucket(String[] arr) {
        int blue = 0, red = 0;
        for (String s : arr) {
            if (s.equals("Blue")) blue++;
            else red++;
        }

        int i = 0;
        while (blue > 0) {
            arr[i++] = "Blue";
            blue--;
        }
        while (red > 0) {
            arr[i++] = "Red";
            red--;
        }
    }

    static void threeColorBucket(String[] arr) {
        int blue = 0, red = 0, green = 0;

        for (String s : arr) {
            if (s.equals("Blue")) blue++;
            else if (s.equals("Red")) red++;
            else green++;
        }

        int i = 0;
        while (blue > 0) {
            arr[i++] = "Blue";
            blue--;
        }
        while (red > 0) {
            arr[i++] = "Red";
            red--;
        }
        while (green > 0) {
            arr[i++] = "Green";
            green--;
        }
    }

    static void fourColorBucket(String[] arr) {
        int blue = 0, red = 0, green = 0, yellow = 0;

        for (String s : arr) {
            if (s.equals("Blue")) blue++;
            else if (s.equals("Red")) red++;
            else if (s.equals("Green")) green++;
            else yellow++;
        }

        int i = 0;
        while (blue > 0) {
            arr[i++] = "Blue";
            blue--;
        }
        while (red > 0) {
            arr[i++] = "Red";
            red--;
        }
        ;
        while (green > 0) {
            arr[i++] = "Green";
            green--;
        }
        while (yellow > 0) {
            arr[i++] = "Yellow";
            yellow--;
        }
    }

    static void main() {
        String[] a = {"Red", "Blue", "Red", "Blue", "Blue", "Red"};
        twoColorBucket(a);
        System.out.println("Two Colors:   " + Arrays.toString(a));

        String[] b = {"Red", "Green", "Blue", "Red", "Blue", "Green"};
        threeColorBucket(b);
        System.out.println("Three Colors: " + Arrays.toString(b));

        String[] c = {"Yellow", "Red", "Green", "Blue", "Red", "Yellow", "Blue", "Green"};
        fourColorBucket(c);
        System.out.println("Four Colors:  " + Arrays.toString(c));
    }
}
