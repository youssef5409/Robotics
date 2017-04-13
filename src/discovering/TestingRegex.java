/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discovering;
        import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Youss
 */
public class TestingRegex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


final String regex = "^(1[0-2]|0?[1-9]):[0-5][0-9] (AM|PM)$";
final String string = "1:05 PM";

final Pattern pattern = Pattern.compile(regex);
final Matcher matcher = pattern.matcher(string);

if (matcher.find()) {
    System.out.println("Full match: " + matcher.group(0));
    for (int i = 1; i <= matcher.groupCount(); i++) {
        System.out.println("Group " + i + ": " + matcher.group(i));
    }
}
    }
    
}
