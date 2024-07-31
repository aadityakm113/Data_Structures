package Backtracking;
import java.util.Scanner;

public class RatMaze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = scanner.nextInt(); // Size of the matrix
            int[][] maze = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    maze[i][j] = scanner.nextInt();
                }
            }

            int[][] solution = new int[N][N];
            if (solveMaze(maze, N, solution)) {
                printSolution(solution, N);
            } else {
                System.out.println("-1");
            }
        }

        scanner.close();
    }

    private static boolean solveMaze(int[][] maze, int N, int[][] solution) {
        if (solveMazeUtil(maze, 0, 0, solution, N)) {
            return true;
        }
        return false;
    }

    private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] solution, int N) {
        // If destination is reached, maze[N-1][N-1]
        if (x == N - 1 && y == N - 1) {
            solution[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y, N)) {
            solution[x][y] = 1;

            // Try all possible jumps
            for (int jump = 1; jump <= maze[x][y] && jump < N; jump++) {
                // Move forward
                if ((solveMazeUtil(maze, x, y + jump, solution, N))||
                (solveMazeUtil(maze,x+jump,y,solution,N))){
                    return true;
                }

                // Move downward
                //if (solveMazeUtil(maze, x + jump, y, solution, N)) {
                  //  return true;
                //}
            }

            // If none of the above movements work, backtrack
            solution[x][y] = 0;
        }

        return false;
    }

    private static boolean isSafe(int[][] maze, int x, int y, int N) {
        return x >= 0 && x < N && y >= 0 && y < N && maze[x][y] != 0;
    }

    private static void printSolution(int[][] solution, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }
}