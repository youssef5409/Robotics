/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discovering;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Youss
 */
public class TestingTimeImport {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
          String time = "3:30 PM";

    SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm a");

    SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm");

    System.out.println(date24Format.format(date12Format.parse(time)));
    }
    
}
