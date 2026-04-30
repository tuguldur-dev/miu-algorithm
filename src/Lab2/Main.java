package Lab2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            int max = arr[maxIndex];
            if (max < arr[i]) {
                maxIndex = i;
            }
        }

        int secondMaxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == maxIndex) {
                continue;
            }
            int max = arr[secondMaxIndex];
            if (max < arr[i]) {
                secondMaxIndex = i;
            }
        }

        int thirdMaxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == maxIndex || i == secondMaxIndex) {
                continue;
            }
            int max = arr[thirdMaxIndex];
            if (max < arr[i]) {
                thirdMaxIndex = i;
            }
        }

        return arr[thirdMaxIndex];
    }

    public static int findMax2(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0];
        int preMax = arr[0];
        int prePreMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                prePreMax = preMax;
                preMax = max;
                max = arr[i];
            } else if (preMax < arr[i]) {
                prePreMax = preMax;
                preMax = arr[i];
            } else if (prePreMax < arr[i]) {
                prePreMax = arr[i];
            }
        }

        return prePreMax;
    }

    public static int findMax3(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i: arr) {
            queue.add(i);
        }
        queue.poll();
        queue.poll();

        return queue.peek();
    }

    static void main(String[] args) {
        int[] input = {7, 20, 18, 4, 20, 19, 20, 3};

        System.out.println("Algorithm 1: " + findMax(input));
        System.out.println("Algorithm 2: " + findMax2(input));
        System.out.println("Algorithm 3: " + findMax3(input));
    }
}
