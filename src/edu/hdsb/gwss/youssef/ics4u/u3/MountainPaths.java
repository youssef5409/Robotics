/*
 * Mountain Paths - Greedy Algorithm
 * Mr. Youssef..
 * 2018.03.26 - v1.0
 */
package edu.hdsb.gwss.youssef.ics4u.u3;

import java.util.*;
import java.io.*;
import java.awt.*;

public class MountainPaths {

    /**
     * Mount Paths
     *
     * @param args
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        // ***********************************
        // TASK 1:  read data into a 2D Array
        // 
        System.out.println("TASK 1: READ DATA");
        int[][] data = read("Colorado.844x480.dat");

        // ***********************************
        // Construct DrawingPanel, and get its Graphics context
        //
        DrawingPanel panel = new DrawingPanel(data[0].length, data.length);
        Graphics g = panel.getGraphics();

        // ***********************************
        // TASK 2:  find HIGHEST & LOWEST elevation; for GRAY SCALE
        //
        System.out.println("TASK 2: HIGHEST / LOWEST ELEVATION");
        int min = findMinValue(data);
        System.out.println("\tMin: " + min);

        int max = findMaxValue(data);
        System.out.println("\tMax: " + max);

        // ***********************************
        // TASK 3:  Draw The Map
        //
        System.out.println("TASK 3: DRAW MAP");
        drawMap(g, data);

        // ***********************************
        // TASK 4A:  implement indexOfMinInCol
        //
        System.out.println("TASK 4A: INDEX OF MIN IN COL 0");
        int minRow = indexOfMinInCol(data, 0);
        System.out.println("\tRow with lowest Col 0 Value: " + minRow);

        // ***********************************
        // TASK 4B:  use minRow as starting point to draw path
        //
        System.out.println("TASK 4B: PATH from LOWEST STARTING ELEVATION");
        g.setColor(Color.RED);
        int totalChange = drawLowestElevPath(g, data, minRow, 0); //
        System.out.println("\tLowest-Elevation-Change Path starting at row " + minRow + " gives total change of: " + totalChange);

        // ***********************************
        // TASK 5:  determine the BEST path
        //
        g.setColor(Color.RED);
        int bestRow = indexOfLowestElevPath(g, data);

        // ***********************************
        // TASK 6:  draw the best path
        //
        System.out.println("TASK 6: DRAW BEST PATH");
        //drawMap.drawMap(g); //use this to get rid of all red lines
        g.setColor(Color.GREEN); //set brush to green for drawing best path
        totalChange = drawLowestElevPath(g, data, bestRow, 0);
        System.out.println("\tThe Lowest-Elevation-Change Path starts at row: " + bestRow + " and gives a total change of: " + totalChange);
    }

    /**
     * This method reads a 2D data set from the specified file. The Graphics'
     * industry standard is width by height (width x height), while programmers
     * use rows x cols / (height x width).
     *
     * @param fileName the name of the file
     * @return a 2D array (rows x cols) of the data from the file read
     * @throws java.io.FileNotFoundException
     */
    public static int[][] read(String fileName) throws FileNotFoundException {
        int i = -1;
        int j;

        int row = 1;
        int col = 0;

        Scanner read = new Scanner(new File(".\\data\\mountain.paths\\" + fileName));
        StringTokenizer st = new StringTokenizer(read.nextLine());

        while (st.hasMoreTokens()) {
            st.nextToken();
            col++;
        }

        while (read.hasNextLine()) {
            read.nextLine();
            row++;
        }

        read = new Scanner(new File(".\\data\\mountain.paths\\" + fileName));
        int[][] data = new int[row][col];

        while (read.hasNextLine()) {
            j = -1;
            i++;
            st = new StringTokenizer(read.nextLine());
            while (st.hasMoreTokens()) {
                j++;
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return data;
    }

    /**
     * @param grid a 2D array from which you want to find the smallest value
     * @return the smallest value in the given 2D array
     */
    public static int findMinValue(int[][] grid) {
        int min = grid[0][0];

        for (int[] row : grid) {
            for (int i : row) {
                if (i < min) {
                    min = i;
                }
            }
        }
        return min;
    }

    /**
     * @param grid a 2D array from which you want to find the largest value
     * @return the largest value in the given 2D array
     */
    public static int findMaxValue(int[][] grid) {
        int max = grid[0][0];

        for (int[] row : grid) {
            for (int i : row) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;

    }

    /**
     * Given a 2D array of elevation data create a image of size rows x cols,
     * drawing a 1x1 rectangle for each value in the array whose color is set to
     * a a scaled gray value (0-255). Note: to scale the values in the array to
     * 0-255 you must find the min and max values in the original data first.
     *
     * @param g a Graphics context to use
     * @param data
     */
    public static void drawMap(Graphics g, int[][] data) {
        int c;
        int normalizer = 0;
        int minVal = findMinValue(data);
        
        if (minVal < 0) {
            normalizer = -minVal;
        }
        
        double divisor = (findMinValue(data) + findMaxValue(data) + 2 * normalizer);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                c = (int) (( (data[i][j] + normalizer) / divisor) * 255); 
                g.setColor(new Color(c, c, c));
                g.fillRect(j, i, 1, 1);
            }
        }
    }

    /**
     * Scan a single column of a 2D array and return the index of the row that
     * contains the smallest value
     *
     * @param grid a 2D array
     * @param col
     * @col the column in the 2D array to process
     * @return the index of smallest value from grid at the given col
     */
    public static int indexOfMinInCol(int[][] grid, int col) {
        int min = grid[0][0];
        int minRow = 0;

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] < min) {
                min = grid[i][col];
                minRow = i;
            }
        }
        return minRow;
    }

    /**
     * Find the minimum elevation-change route from West-to-East in the given
     * grid, from the given starting row, and draw it using the given graphics
     * context
     *
     * @param g - the graphics context to use
     * @param data
     * @param row - the starting row for traversing to find the min path
     * @param col
     * @return total elevation of the route
     */
    public static int drawLowestElevPath(Graphics g, int[][] data, int row, int col) {
        if (row < 0 || col < 0) {
            return -1;
        }

        if (col == data[row].length - 1) {
            return 0;
        }

        int now = data[row][col];
        int fd = Math.abs(now - data[row][col + 1]);

        int up;
        int dn;

        if (row == 0) {
            dn = Math.abs(now - data[row + 1][col + 1]);
            up = fd + 1;
        } else if (row == data.length - 1) {
            up = Math.abs(now - data[row - 1][col + 1]);
            dn = fd + 1;
        } else {
            up = Math.abs(now - data[row - 1][col + 1]);
            dn = Math.abs(now - data[row + 1][col + 1]);
        }

        if (fd <= up && fd <= dn) {
            g.fillRect(col + 1, row, 1, 1);
            return fd + drawLowestElevPath(g, data, row, col + 1);
            
        } else if (up == dn) {
            
            if (Math.random() >= 0.5) {
                g.fillRect(col + 1, row - 1, 1, 1);
                return up + drawLowestElevPath(g, data, row - 1, col + 1);
                
            } else {
                g.fillRect(col + 1, row + 1, 1, 1);
                return dn + drawLowestElevPath(g, data, row + 1, col + 1);
            }
            
        } else if (up < dn) {
            g.fillRect(col + 1, row - 1, 1, 1);
            return up + drawLowestElevPath(g, data, row - 1, col + 1);
            
        } else {
            g.fillRect(col + 1, row + 1, 1, 1);
            return dn + drawLowestElevPath(g, data, row + 1, col + 1);
        }
        
    }

    /**
     * Generate all west-to-east paths, find the one with the lowest total
     * elevation change, and return the index of the row that path starts on.
     *
     * @param g - the graphics context to use
     * @param data
     * @return the index of the row where the lowest elevation-change path
     * starts.
     */
    public static int indexOfLowestElevPath(Graphics g, int[][] data) {
        
        int elev = drawLowestElevPath(g, data, 0, 0);
        int bestRow = 0;
        
        for (int i = 1; i < data.length; i++) {
            if (drawLowestElevPath(g, data, i, 0) < elev) {
                elev = drawLowestElevPath(g, data, i, 0);
                bestRow = i;
            }
        }
        
        return bestRow;
    }
}
