package Lab10;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
    static int Solution(int[][] arr) {
        int components = 0;
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }

            components++;

            visited[i] = true;

            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(i);

            while (!queue.isEmpty()) {
                int v = queue.poll();

                for (int k = 0; k < arr[v].length; k++) {
                    if (arr[v][k] == 1 && !visited[k]) {
                        visited[k] = true;
                        queue.add(k);
                    }
                }
            }

        }
        return components;
    }


    static void main(String[] args) {
        int[][] graph = {
                    /*A  B  C  D  E */
                /*A*/{0, 1, 0, 0, 0},
                /*B*/{1, 0, 1, 0, 0},
                /*C*/{0, 1, 0, 0, 0},
                /*D*/{0, 0, 0, 0, 1},
                /*E*/{0, 0, 0, 1, 0}
        };
        IO.println(Solution(graph));
    }
}
