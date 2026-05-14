package Lab10;

import java.util.Stack;

public class DFS {
    static int checkAdjacent(int[][] arr, boolean[] visited, int v) {
        for (int k = 0; k < arr[v].length; k++) {
            if (arr[v][k] == 1 && !visited[k]) {
                return k;
            }
        }
        return -1;
    }

    static int Solution(int[][] arr) {
        int components = 0;
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }

            components++;

            visited[i] = true;
            Stack<Integer> stack = new Stack<>();
            stack.push(i);

            while (!stack.isEmpty()) {
                int v = stack.peek();
                int neighbor = checkAdjacent(arr, visited, v);
                if (neighbor != -1) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                } else {
                    stack.pop();
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
