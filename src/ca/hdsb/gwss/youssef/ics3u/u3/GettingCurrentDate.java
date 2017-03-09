/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

/**
 *
 * @author 1mohamedyou
 */
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GettingCurrentDate {
   public static void main(String[] args) {
       //getting current date and time using Date class
       DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
       Date dateobj = new Date();
       System.out.println(df.format(dateobj));

       /*getting current date time using calendar class 
        * An Alternative of above*/
       Calendar calobj = Calendar.getInstance();
       System.out.println(df.format(calobj.getTime()));
    }
}
