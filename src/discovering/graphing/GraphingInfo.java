
package discovering.graphing;

import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class GraphingInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        double y;
        String done = "";
        System.out.println("Hi, I can make line graphs for you.");
        Scanner read = new Scanner(System.in);
        while (!done.equals("done")) {
            System.out.println("Enter the x co-ordinate of your point");
            x = read.nextDouble();
            System.out.println("Enter the y co-ordinate of your point");
            y = read.nextDouble();
            System.out.println("If that was your last point, enter \"done\", if not"
                    + "Press Enter.");
        }
    }

}
