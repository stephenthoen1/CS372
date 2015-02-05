/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;
import java.util.*;
/**
 *Checks to validate dates to ensure the user can only select a valid date.
 * @author stephenthoen
 */
public class DateValidation {
    
    //PT -- javadoc? -3
   public static ArrayList<Integer> getDate(String month, String year)
   {
       int newYear = Integer.parseInt(year);
       String newMonth = month;
       ArrayList<Integer> list = new ArrayList<Integer>();
       if(month.equals("January") || month.equals("March") || month.equals("May")
               || month.equals("July") || month.equals("August") || month.equals("October")
               || month.equals("December"))
       {
           for(int i = 1; i <= 31; i++)
               list.add(i);
       }
       else if(month.equals("April") || month.equals("June") || month.equals("September")
               || month.equals("November"))
       {
           for(int i = 1; i <= 30; i++)
               list.add(i);
       }
       else if(month.equals("Feburary"))
       {
            if((newYear % 400 == 0) || ((newYear % 4 == 0) && (newYear % 100 != 0)))
            {
                for(int i = 1; i <= 29; i++)
                list.add(i);
            }
            else
            {
                for(int i = 1; i <= 28; i++)
                list.add(i);
            }
       }
       
       
       
       
       return list;
   }
    
    
}
