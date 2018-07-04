/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u3;

/**
 *
 * @author 1mohamedyou
 */
public class MazeSolver {

    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final char WALL = 'W';
    private static final char EXIT = 'X';
    private static final char OPEN = '.';
    private static final char TRIED = '-';
    private static final char GOOD_PATH = '+';

    private final char[][] maze = {
        {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'},
        {'W', '.', '.', '.', 'W', '.', '.', '.', '.', '.', '.', '.', '.', 'W'},
        {'W', '.', 'W', '.', 'W', '.', 'W', 'W', 'W', '.', 'W', 'W', 'W', 'W'},
        {'W', '.', 'W', '.', '.', '.', 'W', 'W', '.', '.', '.', '.', 'W', 'W'},
        {'W', 'W', 'W', '.', 'W', '.', 'W', 'W', '.', 'W', 'W', 'W', 'W', 'W'},
        {'W', '.', 'W', 'W', 'W', 'W', 'W', '.', '.', '.', '.', '.', 'W', 'W'},
        {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'}
    };

    /**
     * Display the current maze.
     *
     * @param row
     * @param col
     * @return
     */
    public boolean findExitFrom(int row, int col) {
        boolean successful = false;

        if (maze[row][col] == EXIT) {
            maze[row][col] = GOOD_PATH;
            return true;
        }

        maze[row][col] = TRIED;

        switch (maze[row][col + 1]) {

            case OPEN: //break??
            case EXIT:
                successful = findExitFrom(row, col + 1);

        }

        //DOWN, if no exit found.
        if (!successful) {

            switch (maze[row + 1][col]) {
                case OPEN:
                case EXIT:
                    successful = findExitFrom(row + 1, col);
            }

        }

        if (!successful) {

            switch (maze[row - 1][col]) {
                case OPEN:
                case EXIT:
                    successful = findExitFrom(row - 1, col);
            }

        }

        if (!successful) {

            switch (maze[row][col - 1]) {
                case OPEN:
                case EXIT:
                    successful = findExitFrom(row, col - 1);
            }

        }

        if (successful) {
            maze[row][col] = GOOD_PATH;
        }
        return successful;
    }

    /**
     * Display the current maze.
     */
    public void solve() {

        // VARIABLES
        int row = -1;
        int col = -1;

        // FIND RANDOM EXIT
        boolean exitPlaced = false;
        int wall = 3; // (int) (Math.random() * 4);

        do {
            switch (wall) {
                case 0:  // RIGHT EDGE
                    row = (int) (Math.random() * maze.length);
                    col = maze[0].length - 1;
                    if (maze[row][col - 1] == OPEN) {
                        exitPlaced = true;
                    }
                    break;
                case 1:  // BOTTOM EDGE
                    row = maze.length - 1;
                    col = (int) (Math.random() * maze[0].length);
                    if (maze[row - 1][col] == OPEN) {
                        exitPlaced = true;
                    }
                    break;
                case 2:  // LEFT EDGE
                    row = (int) (Math.random() * maze.length);
                    col = 0;
                    if (maze[row][col + 1] == OPEN) {
                        exitPlaced = true;
                    }
                    break;
                case 3:  // TOP EDGE
                    row = 0;
                    col = (int) (Math.random() * maze[0].length);
                    if (maze[row + 1][col] == OPEN) {

                        exitPlaced = true;
                    }
                    break;
            }
        } while (!exitPlaced);

        maze[row][col] = EXIT;

        // FIND RANDOM START LOCATION
        do {
            row = (int) (Math.random() * maze.length);
            col = (int) (Math.random() * maze[0].length);
        } while (maze[row][col] != OPEN);

        // START!
        System.out.println("START LOCATION: (" + row + "," + col + ")");
        findExitFrom(row, col);

        // SHOW EXIT
        displayMaze();

    }

    /**
     * Display the current maze.
     */
    public void displayMaze() {
        for (char[] maze1 : maze) {
            for (int col = 0; col < maze1.length; col++) {
                if (maze1[col] == '+') {
                    System.out.print(ANSI_GREEN + maze1[col] + ANSI_RESET);
                } else {
                    System.out.print(maze1[col]);
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MazeSolver lmo = new MazeSolver();
        lmo.displayMaze();
        lmo.solve();

    }

}
